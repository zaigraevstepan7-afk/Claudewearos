package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class bf extends bm {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f4062a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f4063b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bn f4064c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bf(bn bnVar, TaskCompletionSource taskCompletionSource, int i10, long j, TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.f4062a = j;
        this.f4063b = taskCompletionSource2;
        this.f4064c = bnVar;
    }

    @Override // kf.i0
    public final void b() {
        if (bn.l(this.f4064c)) {
            a(new StandardIntegrityException(-2, null));
            return;
        }
        if (bn.k(this.f4064c, 0)) {
            a(new StandardIntegrityException(-14, null));
            return;
        }
        try {
            bn bnVar = this.f4064c;
            kf.x xVar = (kf.x) bnVar.f4084a.f9572n;
            Bundle bundleB = bn.b(bnVar, this.f4062a, 0);
            bl blVar = new bl(this.f4064c, this.f4063b);
            kf.v vVar = (kf.v) xVar;
            vVar.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(vVar.f9553b);
            int i10 = kf.t.f9597a;
            parcelObtain.writeInt(1);
            bundleB.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(blVar);
            vVar.n(2, parcelObtain);
        } catch (RemoteException e10) {
            this.f4064c.f4085b.a(e10, "warmUpIntegrityToken(%s)", Long.valueOf(this.f4062a));
            this.f4063b.trySetException(new StandardIntegrityException(-100, e10));
        }
    }
}
