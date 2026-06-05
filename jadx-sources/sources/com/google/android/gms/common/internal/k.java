package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import ce.x0;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.internal.common.zzc;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k extends od.a {
    public static final Parcelable.Creator<k> CREATOR = new x0(25);
    public static final Scope[] H = new Scope[0];
    public static final nd.d[] I = new nd.d[0];
    public Account A;
    public nd.d[] B;
    public nd.d[] C;
    public final boolean D;
    public final int E;
    public boolean F;
    public final String G;

    /* renamed from: a, reason: collision with root package name */
    public final int f3656a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3657b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3658c;

    /* renamed from: d, reason: collision with root package name */
    public String f3659d;

    /* renamed from: e, reason: collision with root package name */
    public IBinder f3660e;

    /* renamed from: f, reason: collision with root package name */
    public Scope[] f3661f;

    /* renamed from: z, reason: collision with root package name */
    public Bundle f3662z;

    public k(int i10, int i11, int i12, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, nd.d[] dVarArr, nd.d[] dVarArr2, boolean z2, int i13, boolean z10, String str2) {
        Scope[] scopeArr2 = scopeArr == null ? H : scopeArr;
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        nd.d[] dVarArr3 = I;
        nd.d[] dVarArr4 = dVarArr == null ? dVarArr3 : dVarArr;
        dVarArr3 = dVarArr2 != null ? dVarArr2 : dVarArr3;
        this.f3656a = i10;
        this.f3657b = i11;
        this.f3658c = i12;
        if ("com.google.android.gms".equals(str)) {
            this.f3659d = "com.google.android.gms";
        } else {
            this.f3659d = str;
        }
        if (i10 < 2) {
            Account account2 = null;
            if (iBinder != null) {
                int i14 = a.f3614a;
                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
                IInterface q0Var = iInterfaceQueryLocalInterface instanceof n ? (n) iInterfaceQueryLocalInterface : new q0(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
                long jClearCallingIdentity = Binder.clearCallingIdentity();
                try {
                    try {
                        q0 q0Var2 = (q0) q0Var;
                        Parcel parcelZzB = q0Var2.zzB(2, q0Var2.zza());
                        Account account3 = (Account) zzc.zza(parcelZzB, Account.CREATOR);
                        parcelZzB.recycle();
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                        account2 = account3;
                    } catch (RemoteException unused) {
                        Log.w("AccountAccessor", "Remote account accessor probably died");
                        Binder.restoreCallingIdentity(jClearCallingIdentity);
                    }
                } catch (Throwable th2) {
                    Binder.restoreCallingIdentity(jClearCallingIdentity);
                    throw th2;
                }
            }
            this.A = account2;
        } else {
            this.f3660e = iBinder;
            this.A = account;
        }
        this.f3661f = scopeArr2;
        this.f3662z = bundle2;
        this.B = dVarArr4;
        this.C = dVarArr3;
        this.D = z2;
        this.E = i13;
        this.F = z10;
        this.G = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        x0.a(this, parcel, i10);
    }
}
