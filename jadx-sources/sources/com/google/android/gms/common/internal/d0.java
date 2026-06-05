package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import ce.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d0 implements p {

    /* renamed from: a, reason: collision with root package name */
    public final IBinder f3626a;

    public d0(IBinder iBinder) {
        this.f3626a = iBinder;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.f3626a;
    }

    public final void n(g0 g0Var, k kVar) {
        Parcel parcelObtain = Parcel.obtain();
        Parcel parcelObtain2 = Parcel.obtain();
        try {
            parcelObtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            parcelObtain.writeStrongBinder(g0Var.asBinder());
            parcelObtain.writeInt(1);
            x0.a(kVar, parcelObtain, 0);
            this.f3626a.transact(46, parcelObtain, parcelObtain2, 0);
            parcelObtain2.readException();
        } finally {
            parcelObtain2.recycle();
            parcelObtain.recycle();
        }
    }
}
