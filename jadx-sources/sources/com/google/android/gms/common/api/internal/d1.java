package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import com.google.android.gms.internal.common.zzi;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d1 extends w5.t implements l {

    /* renamed from: r0, reason: collision with root package name */
    public static final WeakHashMap f3527r0 = new WeakHashMap();

    /* renamed from: o0, reason: collision with root package name */
    public final Map f3528o0 = Collections.synchronizedMap(new q.e(0));

    /* renamed from: p0, reason: collision with root package name */
    public int f3529p0 = 0;

    /* renamed from: q0, reason: collision with root package name */
    public Bundle f3530q0;

    @Override // w5.t
    public final void C() {
        this.X = true;
        this.f3529p0 = 3;
        Iterator it = this.f3528o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // w5.t
    public final void D(Bundle bundle) {
        for (Map.Entry entry : this.f3528o0.entrySet()) {
            Bundle bundle2 = new Bundle();
            ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
            bundle.putBundle((String) entry.getKey(), bundle2);
        }
    }

    @Override // w5.t
    public final void E() {
        this.X = true;
        this.f3529p0 = 2;
        Iterator it = this.f3528o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // w5.t
    public final void F() {
        this.X = true;
        this.f3529p0 = 4;
        Iterator it = this.f3528o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStop();
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final void b(String str, LifecycleCallback lifecycleCallback) {
        Map map = this.f3528o0;
        if (map.containsKey(str)) {
            throw new IllegalArgumentException(m1.j("LifecycleCallback with tag ", str, " already added to this fragment."));
        }
        map.put(str, lifecycleCallback);
        if (this.f3529p0 > 0) {
            new zzi(Looper.getMainLooper()).post(new b8.b(this, lifecycleCallback, str, 2));
        }
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final LifecycleCallback d(Class cls, String str) {
        return (LifecycleCallback) cls.cast(this.f3528o0.get(str));
    }

    @Override // com.google.android.gms.common.api.internal.l
    public final Activity f() {
        w5.v vVar = this.N;
        if (vVar == null) {
            return null;
        }
        return vVar.f18776d;
    }

    @Override // w5.t
    public final void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.j(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.f3528o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // w5.t
    public final void u(int i10, int i11, Intent intent) {
        super.u(i10, i11, intent);
        Iterator it = this.f3528o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onActivityResult(i10, i11, intent);
        }
    }

    @Override // w5.t
    public final void w(Bundle bundle) {
        super.w(bundle);
        this.f3529p0 = 1;
        this.f3530q0 = bundle;
        for (Map.Entry entry : this.f3528o0.entrySet()) {
            ((LifecycleCallback) entry.getValue()).onCreate(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // w5.t
    public final void y() {
        this.X = true;
        this.f3529p0 = 5;
        Iterator it = this.f3528o0.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }
}
