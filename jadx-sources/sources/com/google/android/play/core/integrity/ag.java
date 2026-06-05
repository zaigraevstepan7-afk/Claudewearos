package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kf.a0;
import kf.c0;
import kf.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class ag extends i0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f4013a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f4014b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f4015c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f4016d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ aj f4017e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag(aj ajVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(taskCompletionSource);
        this.f4013a = bundle;
        this.f4014b = activity;
        this.f4015c = taskCompletionSource2;
        this.f4016d = i10;
        this.f4017e = ajVar;
    }

    @Override // kf.i0
    public final void b() {
        try {
            aj ajVar = this.f4017e;
            c0 c0Var = (c0) ajVar.f4022a.f9572n;
            Bundle bundle = this.f4013a;
            as asVarA = ajVar.f4026e.a(this.f4014b, this.f4015c, ajVar.f4022a);
            a0 a0Var = (a0) c0Var;
            a0Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(a0Var.f9553b);
            int i10 = kf.t.f9597a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            a0Var.n(3, parcelObtain);
        } catch (RemoteException e10) {
            this.f4017e.f4023b.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f4016d));
            this.f4015c.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
