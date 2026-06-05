package com.google.android.play.core.integrity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import com.google.android.gms.tasks.TaskCompletionSource;
import kf.a0;
import kf.c0;
import kf.i0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class af extends i0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f4007a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Long f4008b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ Parcelable f4009c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ TaskCompletionSource f4010d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ IntegrityTokenRequest f4011e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ aj f4012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af(aj ajVar, TaskCompletionSource taskCompletionSource, byte[] bArr, Long l10, Parcelable parcelable, TaskCompletionSource taskCompletionSource2, IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.f4007a = bArr;
        this.f4008b = l10;
        this.f4009c = parcelable;
        this.f4010d = taskCompletionSource2;
        this.f4011e = integrityTokenRequest;
        this.f4012f = ajVar;
    }

    @Override // kf.i0
    public final void a(Exception exc) {
        if (exc instanceof kf.f) {
            super.a(new IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // kf.i0
    public final void b() {
        try {
            aj ajVar = this.f4012f;
            c0 c0Var = (c0) ajVar.f4022a.f9572n;
            Bundle bundleA = aj.a(ajVar, this.f4007a, this.f4008b, this.f4009c);
            ai aiVar = new ai(this.f4012f, this.f4010d);
            a0 a0Var = (a0) c0Var;
            a0Var.getClass();
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeInterfaceToken(a0Var.f9553b);
            int i10 = kf.t.f9597a;
            parcelObtain.writeInt(1);
            bundleA.writeToParcel(parcelObtain, 0);
            parcelObtain.writeStrongBinder(aiVar);
            a0Var.n(2, parcelObtain);
        } catch (RemoteException e10) {
            this.f4012f.f4023b.a(e10, "requestIntegrityToken(%s)", this.f4011e);
            this.f4010d.trySetException(new IntegrityServiceException(-100, e10));
        }
    }
}
