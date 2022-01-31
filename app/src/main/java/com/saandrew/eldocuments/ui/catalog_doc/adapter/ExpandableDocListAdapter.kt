package com.saandrew.eldocuments.ui.catalog_doc.adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseExpandableListAdapter
import android.widget.Button
import android.widget.ExpandableListAdapter
import android.widget.ExpandableListView
import androidx.navigation.NavController
import androidx.navigation.Navigation
import androidx.navigation.Navigation.findNavController
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment
import androidx.recyclerview.widget.RecyclerView
import com.saandrew.eldocuments.R

import com.saandrew.eldocuments.ui.catalog_doc.data.BodySource
import com.saandrew.eldocuments.ui.catalog_doc.data.HeaderSource

class ExpandableDocListAdapter(val context: Context,
                               val expandableListView: ExpandableListView,
                               val navController: NavController
): BaseExpandableListAdapter() {
    val header = HeaderSource.data
    val body = BodySource.data
    val resources = context.resources


    override fun getGroupCount() = header.size

    override fun getChildrenCount(groupPosition: Int) = body[groupPosition].size

    override fun getGroup(groupPosition: Int) = header[groupPosition]

    override fun getChild(groupPosition: Int, childPosition: Int) = body[groupPosition][childPosition]

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

        val groupText = context.getString(getGroup(groupPosition))

        if (convertView == null) {
            val infalInflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = infalInflater.inflate(R.layout.doc_list_item, null)
        }

        val button = convertView?.findViewById<Button>(R.id.button_group_item)
        if (button != null) {
            button.text = groupText
            button.setOnClickListener {
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

        val childText = resources.getString(getChild(groupPosition, childPosition).stringResourceId)

        if (convertView == null) {
            val infalInflater = context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            convertView = infalInflater.inflate(R.layout.doc_list_children, null)
        }

        val button = convertView?.findViewById<Button>(R.id.button_children_item)
        if (button != null) {
            button.text = childText
            button.setOnClickListener {
                val nav = body[groupPosition][childPosition].navigateId
                if (nav != null) {
                    navController.navigate(nav)
                }
            }
        }

        return convertView!!
    }

    override fun isChildSelectable(groupPosition: Int, childPosition: Int) = true


}