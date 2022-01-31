package com.saandrew.eldocuments;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.saandrew.eldocuments.databinding.ActivityEnterBindingImpl;
import com.saandrew.eldocuments.databinding.ActivityMainBindingImpl;
import com.saandrew.eldocuments.databinding.DocTypeChildrenBindingImpl;
import com.saandrew.eldocuments.databinding.DocumentsFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.DriverLicenseFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.DriverLicenseItemBindingImpl;
import com.saandrew.eldocuments.databinding.EnterFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.HealthInsuranceFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.HealthInsuranceItemBindingImpl;
import com.saandrew.eldocuments.databinding.InsuranceNumberFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.InsuranceNumberItemBindingImpl;
import com.saandrew.eldocuments.databinding.PassportFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.PassportItemBindingImpl;
import com.saandrew.eldocuments.databinding.QrFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.QrResultFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.QrScannerFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.RegisterFragmentBindingImpl;
import com.saandrew.eldocuments.databinding.UserProfileFragmentBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYENTER = 1;

  private static final int LAYOUT_ACTIVITYMAIN = 2;

  private static final int LAYOUT_DOCTYPECHILDREN = 3;

  private static final int LAYOUT_DOCUMENTSFRAGMENT = 4;

  private static final int LAYOUT_DRIVERLICENSEFRAGMENT = 5;

  private static final int LAYOUT_DRIVERLICENSEITEM = 6;

  private static final int LAYOUT_ENTERFRAGMENT = 7;

  private static final int LAYOUT_HEALTHINSURANCEFRAGMENT = 8;

  private static final int LAYOUT_HEALTHINSURANCEITEM = 9;

  private static final int LAYOUT_INSURANCENUMBERFRAGMENT = 10;

  private static final int LAYOUT_INSURANCENUMBERITEM = 11;

  private static final int LAYOUT_PASSPORTFRAGMENT = 12;

  private static final int LAYOUT_PASSPORTITEM = 13;

  private static final int LAYOUT_QRFRAGMENT = 14;

  private static final int LAYOUT_QRRESULTFRAGMENT = 15;

  private static final int LAYOUT_QRSCANNERFRAGMENT = 16;

  private static final int LAYOUT_REGISTERFRAGMENT = 17;

  private static final int LAYOUT_USERPROFILEFRAGMENT = 18;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(18);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.activity_enter, LAYOUT_ACTIVITYENTER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.doc_type_children, LAYOUT_DOCTYPECHILDREN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.documents_fragment, LAYOUT_DOCUMENTSFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.driver_license_fragment, LAYOUT_DRIVERLICENSEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.driver_license_item, LAYOUT_DRIVERLICENSEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.enter_fragment, LAYOUT_ENTERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.health_insurance_fragment, LAYOUT_HEALTHINSURANCEFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.health_insurance_item, LAYOUT_HEALTHINSURANCEITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.insurance_number_fragment, LAYOUT_INSURANCENUMBERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.insurance_number_item, LAYOUT_INSURANCENUMBERITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.passport_fragment, LAYOUT_PASSPORTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.passport_item, LAYOUT_PASSPORTITEM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.qr_fragment, LAYOUT_QRFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.qr_result_fragment, LAYOUT_QRRESULTFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.qr_scanner_fragment, LAYOUT_QRSCANNERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.register_fragment, LAYOUT_REGISTERFRAGMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.saandrew.eldocuments.R.layout.user_profile_fragment, LAYOUT_USERPROFILEFRAGMENT);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYENTER: {
          if ("layout/activity_enter_0".equals(tag)) {
            return new ActivityEnterBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_enter is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_DOCTYPECHILDREN: {
          if ("layout/doc_type_children_0".equals(tag)) {
            return new DocTypeChildrenBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for doc_type_children is invalid. Received: " + tag);
        }
        case  LAYOUT_DOCUMENTSFRAGMENT: {
          if ("layout/documents_fragment_0".equals(tag)) {
            return new DocumentsFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for documents_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DRIVERLICENSEFRAGMENT: {
          if ("layout/driver_license_fragment_0".equals(tag)) {
            return new DriverLicenseFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for driver_license_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_DRIVERLICENSEITEM: {
          if ("layout/driver_license_item_0".equals(tag)) {
            return new DriverLicenseItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for driver_license_item is invalid. Received: " + tag);
        }
        case  LAYOUT_ENTERFRAGMENT: {
          if ("layout/enter_fragment_0".equals(tag)) {
            return new EnterFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for enter_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HEALTHINSURANCEFRAGMENT: {
          if ("layout/health_insurance_fragment_0".equals(tag)) {
            return new HealthInsuranceFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for health_insurance_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_HEALTHINSURANCEITEM: {
          if ("layout/health_insurance_item_0".equals(tag)) {
            return new HealthInsuranceItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for health_insurance_item is invalid. Received: " + tag);
        }
        case  LAYOUT_INSURANCENUMBERFRAGMENT: {
          if ("layout/insurance_number_fragment_0".equals(tag)) {
            return new InsuranceNumberFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for insurance_number_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_INSURANCENUMBERITEM: {
          if ("layout/insurance_number_item_0".equals(tag)) {
            return new InsuranceNumberItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for insurance_number_item is invalid. Received: " + tag);
        }
        case  LAYOUT_PASSPORTFRAGMENT: {
          if ("layout/passport_fragment_0".equals(tag)) {
            return new PassportFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for passport_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_PASSPORTITEM: {
          if ("layout/passport_item_0".equals(tag)) {
            return new PassportItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for passport_item is invalid. Received: " + tag);
        }
        case  LAYOUT_QRFRAGMENT: {
          if ("layout/qr_fragment_0".equals(tag)) {
            return new QrFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for qr_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_QRRESULTFRAGMENT: {
          if ("layout/qr_result_fragment_0".equals(tag)) {
            return new QrResultFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for qr_result_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_QRSCANNERFRAGMENT: {
          if ("layout/qr_scanner_fragment_0".equals(tag)) {
            return new QrScannerFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for qr_scanner_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_REGISTERFRAGMENT: {
          if ("layout/register_fragment_0".equals(tag)) {
            return new RegisterFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for register_fragment is invalid. Received: " + tag);
        }
        case  LAYOUT_USERPROFILEFRAGMENT: {
          if ("layout/user_profile_fragment_0".equals(tag)) {
            return new UserProfileFragmentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for user_profile_fragment is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(17);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "driverLicense");
      sKeys.put(2, "driverLicenseViewModel");
      sKeys.put(3, "enterFragment");
      sKeys.put(4, "enterViewModel");
      sKeys.put(5, "healthInsurance");
      sKeys.put(6, "healthInsuranceViewModel");
      sKeys.put(7, "insuranceNumber");
      sKeys.put(8, "insuranceNumberViewModel");
      sKeys.put(9, "passport");
      sKeys.put(10, "passportViewModel");
      sKeys.put(11, "qrFragment");
      sKeys.put(12, "qrViewModel");
      sKeys.put(13, "registerFragment");
      sKeys.put(14, "registerViewModel");
      sKeys.put(15, "resultViewModel");
      sKeys.put(16, "type");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(18);

    static {
      sKeys.put("layout/activity_enter_0", com.saandrew.eldocuments.R.layout.activity_enter);
      sKeys.put("layout/activity_main_0", com.saandrew.eldocuments.R.layout.activity_main);
      sKeys.put("layout/doc_type_children_0", com.saandrew.eldocuments.R.layout.doc_type_children);
      sKeys.put("layout/documents_fragment_0", com.saandrew.eldocuments.R.layout.documents_fragment);
      sKeys.put("layout/driver_license_fragment_0", com.saandrew.eldocuments.R.layout.driver_license_fragment);
      sKeys.put("layout/driver_license_item_0", com.saandrew.eldocuments.R.layout.driver_license_item);
      sKeys.put("layout/enter_fragment_0", com.saandrew.eldocuments.R.layout.enter_fragment);
      sKeys.put("layout/health_insurance_fragment_0", com.saandrew.eldocuments.R.layout.health_insurance_fragment);
      sKeys.put("layout/health_insurance_item_0", com.saandrew.eldocuments.R.layout.health_insurance_item);
      sKeys.put("layout/insurance_number_fragment_0", com.saandrew.eldocuments.R.layout.insurance_number_fragment);
      sKeys.put("layout/insurance_number_item_0", com.saandrew.eldocuments.R.layout.insurance_number_item);
      sKeys.put("layout/passport_fragment_0", com.saandrew.eldocuments.R.layout.passport_fragment);
      sKeys.put("layout/passport_item_0", com.saandrew.eldocuments.R.layout.passport_item);
      sKeys.put("layout/qr_fragment_0", com.saandrew.eldocuments.R.layout.qr_fragment);
      sKeys.put("layout/qr_result_fragment_0", com.saandrew.eldocuments.R.layout.qr_result_fragment);
      sKeys.put("layout/qr_scanner_fragment_0", com.saandrew.eldocuments.R.layout.qr_scanner_fragment);
      sKeys.put("layout/register_fragment_0", com.saandrew.eldocuments.R.layout.register_fragment);
      sKeys.put("layout/user_profile_fragment_0", com.saandrew.eldocuments.R.layout.user_profile_fragment);
    }
  }
}
