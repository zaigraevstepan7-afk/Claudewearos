package com.google.android.play.core.integrity;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class bh extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Bundle f4070a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f4071b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f4072c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ int f4073d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f4074e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh(bn bnVar, TaskCompletionSource taskCompletionSource, Bundle bundle, Activity activity, TaskCompletionSource taskCompletionSource2, int i10) {
        super(bnVar, taskCompletionSource);
        this.f4070a = bundle;
        this.f4071b = activity;
        this.f4072c = taskCompletionSource2;
        this.f4073d = i10;
        this.f4074e = bnVar;
    }

    @Override // kf.i0
    public final void b() {
        if (bn.l(this.f4074e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        try {
            bn bnVar = this.f4074e;
            kf.e eVar = bnVar.f4084a;
            kf.x xVar = (kf.x) eVar.f9572n;
            Bundle bundle = this.f4070a;
            as asVarA = bnVar.f4088e.a(this.f4071b, this.f4072c, eVar);
            kf.v vVar = (kf.v) xVar;
            vVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(vVar.f9553b);
            int i10 = kf.t.f9597a;
            parcelObtain.writeInt(1);
            bundle.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(asVarA);
            vVar.n(6, parcelObtain);
        } catch (RemoteException e10) {
            this.f4074e.f4085b.a(e10, "requestAndShowDialog(%s)", Integer.valueOf(this.f4073d));
            this.f4072c.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
