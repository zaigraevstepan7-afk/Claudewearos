package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.play.core.integrity.StandardIntegrityManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class bg extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ StandardIntegrityManager.StandardIntegrityTokenRequest f4065a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f4066b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ long f4067c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f4068d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ bn f4069e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bg(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, StandardIntegrityManager.StandardIntegrityTokenRequest standardIntegrityTokenRequest, long j, long j4, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f4065a = standardIntegrityTokenRequest;
        this.f4066b = j;
        this.f4067c = j4;
        this.f4068d = taskCompletionSource2;
        this.f4069e = bnVar;
    }

    @Override // kf.i0
    public final void b() {
        if (bn.l(this.f4069e)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.f4069e, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.f4069e;
            kf.x xVar = (kf.x) bnVar.f4084a.f9572n;
            Bundle bundleA = bn.a(bnVar, this.f4065a, this.f4066b, this.f4067c, 0);
            bk bkVar = new bk(this.f4069e, this.f4068d, this.f4066b);
            kf.v vVar = (kf.v) xVar;
            vVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(vVar.f9553b);
            int i10 = kf.t.f9597a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(bkVar);
            vVar.n(3, parcelObtain);
        } catch (RemoteException e10) {
            this.f4069e.f4085b.a(e10, "requestExpressIntegrityToken(%s, %s, %s)", this.f4065a.requestHash(), this.f4065a.verdictOptOut(), Long.valueOf(this.f4066b));
            this.f4068d.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
