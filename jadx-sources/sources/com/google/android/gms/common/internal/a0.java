package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import ce.x0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 extends od.a {
    public static final Parcelable.Creator<a0> CREATOR = new x0(21);

    /* renamed from: a, reason: collision with root package name */
    public final int f3615a;

    /* renamed from: b, reason: collision with root package name */
    public final IBinder f3616b;

    /* renamed from: c, reason: collision with root package name */
    public final nd.b f3617c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f3618d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f3619e;

    public a0(int i10, IBinder iBinder, nd.b bVar, boolean z2, boolean z10) {
        this.f3615a = i10;
        this.f3616b = iBinder;
        this.f3617c = bVar;
        this.f3618d = z2;
        this.f3619e = z10;
    }

    public final boolean equals(Object obj) {
        Object q0Var;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a0)) {
            return false;
        }
        a0 a0Var = (a0) obj;
        if (!this.f3617c.equals(a0Var.f3617c)) {
            return false;
        }
        Object q0Var2 = null;
        IBinder iBinder = this.f3616b;
        if (iBinder == null) {
            q0Var = null;
        } else {
            int i10 = a.f3614a;
            IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            q0Var = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        IBinder iBinder2 = a0Var.f3616b;
        if (iBinder2 != null) {
            int i11 = a.f3614a;
            IInterface iInterfaceQueryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            q0Var2 = iInterfaceQueryLocalInterface2 instanceof n ? (n) iInterfaceQueryLocalInterface2 : new q0(iBinder2, "com.google.android.gms.common.internal.IAccountAccessor");
        }
        return e0.l(q0Var, q0Var2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        int iH0 = uk.c.h0(20293, parcel);
        uk.c.k0(parcel, 1, 4);
        parcel.writeInt(this.f3615a);
        uk.c.X(parcel, 2, this.f3616b);
        uk.c.b0(parcel, 3, this.f3617c, i10, false);
        uk.c.k0(parcel, 4, 4);
        parcel.writeInt(this.f3618d ? 1 : 0);
        uk.c.k0(parcel, 5, 4);
        parcel.writeInt(this.f3619e ? 1 : 0);
        uk.c.j0(iH0, parcel);
    }
}
