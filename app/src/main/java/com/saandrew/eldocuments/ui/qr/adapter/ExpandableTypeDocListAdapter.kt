package com.saandrew.eldocuments.ui.qr.adapter

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import com.saandrew.eldocuments.R
import com.saandrew.eldocuments.api_model.AvailableDocuments
import com.saandrew.eldocuments.api_model.Types
import com.saandrew.eldocuments.databinding.DocTypeChildrenBinding
import com.saandrew.eldocuments.ui.qr.QrViewModel

class ExpandableTypeDocListAdapter(val context: Context,
                                   val expandableListView: ExpandableListView,
                                   val viewModel: QrViewModel
): BaseExpandableListAdapter() {
    var data: List<AvailableDocuments> = listOf()

    @JvmName("setData1")
    @SuppressLint("NotifyDataSetChanged")
    fun setData(data: List<AvailableDocuments>) {
        this.data = data
        notifyDataSetChanged()
    }


    override fun getGroupCount() = data.size

    override fun getChildrenCount(groupPosition: Int) = data[groupPosition].data.size

    override fun getGroup(groupPosition: Int): String {
        return Dictionary.parentDict(data[groupPosition].idGroup)
    }

    override fun getChild(groupPosition: Int, childPosition: Int): Types {
        return data[groupPosition].data[childPosition]
    }

    override fun getGroupId(groupPosition: Int) = groupPosition.toLong()

    override fun getChildId(groupPosition: Int, childPosition: Int) = childPosition.toLong()

    override fun hasStableIds() = false

    override fun getGroupView(
        groupPosition: Int,
        isExpanded: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView

        val groupText = getGroup(groupPosition)

        if (convertView == null) {
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = inflater.inflate(R.layout.doc_type_parent, null)
        }

        val textView = convertView?.findViewById<TextView>(R.id.doc_parent)
        if (textView != null) {
            textView.text = groupText
            textView.setOnClickListener {
                if(expandableListView.isGroupExpanded(groupPosition)){
                    expandableListView.collapseGroup(groupPosition)
                }
                else {
                    expandableListView.expandGroup(groupPosition)
                }
            }
        }

        return convertView!!
    }

    override fun getChildView(
        groupPosition: Int,
        childPosition: Int,
        isLastChild: Boolean,
        convertView: View?,
        parent: ViewGroup?
    ): View {
        var convertView = convertView

        val child = getChild(groupPosition, childPosition)
        var binding: DocTypeChildrenBinding? = null

        if (convertView == null) {
            val inflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

            binding = DocTypeChildrenBinding.inflate(inflater)
            binding.type = child
            binding.docSwitch.text = Dictionary.childrenDict(child.docType)
            binding.docSwitch.setOnClickListener {
                child.available = !child.available
                viewModel.typeDoc.value!![groupPosition].data[childPosition].available = child.available

            }

            convertView = binding.root
        }


        return convertView
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int) = true
}