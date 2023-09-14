package com.rtncalculator;

import androidx.annotation.NonNull;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import java.util.Map;
import java.util.HashMap;
//Imp - this should reflect proper name
import com.rtncalculator.NativeCalculatorModuleSpec;
//import com.calculatorapp.NativeCalculatorModuleSpec;

// Extends (name convention of ts file name aka NativeRTNCalculator + Spec
public class NativeCalculatorModule extends NativeCalculatorModuleSpec {

    //Using same name as mentioned in ts file - getEnforcing<Spec>('RTNCalculatorModule');
    public static String NAME = "NativeCalculatorModule";

    NativeCalculatorModule(ReactApplicationContext context) {
        super(context);
    }

    @Override
    @NonNull
    public String getName() {
        return NAME;
    }

    @Override
    public void add(double a, double b, Promise promise) {

        promise.resolve(a + b);
    }
}
