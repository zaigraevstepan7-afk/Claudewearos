package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.Keep;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class LifecycleCallback {
    protected final l mLifecycleFragment;

    public LifecycleCallback(l lVar) {
        this.mLifecycleFragment = lVar;
    }

    @Keep
    private static l getChimeraLifecycleFragmentImpl(k kVar) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static l getFragment(Activity activity) {
        return getFragment(new k(activity));
    }

    public Activity getActivity() {
        Activity activityF = this.mLifecycleFragment.f();
        com.google.android.gms.common.internal.e0.i(activityF);
        return activityF;
    }

    public static l getFragment(k kVar) {
        c1 c1Var;
        d1 d1Var;
        Activity activity = kVar.f3558a;
        if (!(activity instanceof w5.w)) {
            if (activity == null) {
                throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
            }
            WeakHashMap weakHashMap = c1.f3521d;
            WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
            if (weakReference != null && (c1Var = (c1) weakReference.get()) != null) {
                return c1Var;
            }
            try {
                c1 c1Var2 = (c1) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
                if (c1Var2 == null || c1Var2.isRemoving()) {
                    c1Var2 = new c1();
                    activity.getFragmentManager().beginTransaction().add(c1Var2, "LifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(activity, new WeakReference(c1Var2));
                return c1Var2;
            } catch (ClassCastException e10) {
                throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e10);
            }
        }
        w5.w wVar = (w5.w) activity;
        ag.i iVar = wVar.M;
        WeakHashMap weakHashMap2 = d1.f3527r0;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(wVar);
        if (weakReference2 != null && (d1Var = (d1) weakReference2.get()) != null) {
            return d1Var;
        }
        try {
            d1 d1Var2 = (d1) ((w5.v) iVar.f449b).f18779z.C("SupportLifecycleFragmentImpl");
            if (d1Var2 == null || d1Var2.E) {
                d1Var2 = new d1();
                w5.i0 i0Var = ((w5.v) iVar.f449b).f18779z;
                i0Var.getClass();
                w5.a aVar = new w5.a(i0Var);
                aVar.f(0, d1Var2, "SupportLifecycleFragmentImpl", 1);
                aVar.e(true, true);
            }
            weakHashMap2.put(wVar, new WeakReference(d1Var2));
            return d1Var2;
        } catch (ClassCastException e11) {
            throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e11);
        }
    }

    public void onDestroy() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStop() {
    }

    public void onCreate(Bundle bundle) {
    }

    public void onSaveInstanceState(Bundle bundle) {
    }

    public static l getFragment(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }

    public void onActivityResult(int i10, int i11, Intent intent) {
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
