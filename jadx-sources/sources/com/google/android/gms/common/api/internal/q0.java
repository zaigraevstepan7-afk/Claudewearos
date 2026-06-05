package com.google.android.gms.common.api.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.internal.base.zac;
import java.util.Set;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class q0 extends je.c implements com.google.android.gms.common.api.n, com.google.android.gms.common.api.o {
    public static final ed.g A = ie.b.f8507a;

    /* renamed from: a, reason: collision with root package name */
    public final Context f3578a;

    /* renamed from: b, reason: collision with root package name */
    public final Handler f3579b;

    /* renamed from: c, reason: collision with root package name */
    public final ed.g f3580c;

    /* renamed from: d, reason: collision with root package name */
    public final Set f3581d;

    /* renamed from: e, reason: collision with root package name */
    public final com.google.android.gms.common.internal.i f3582e;

    /* renamed from: f, reason: collision with root package name */
    public je.a f3583f;

    /* renamed from: z, reason: collision with root package name */
    public i0 f3584z;

    public q0(Context context, Handler handler, com.google.android.gms.common.internal.i iVar) {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f3578a = context;
        this.f3579b = handler;
        this.f3582e = iVar;
        this.f3581d = iVar.f3640a;
        this.f3580c = A;
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void n() {
        je.a aVar = this.f3583f;
        aVar.getClass();
        try {
            aVar.f8856b.getClass();
            Account account = new Account(com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT, "com.google");
            GoogleSignInAccount googleSignInAccountB = com.google.android.gms.common.internal.f.DEFAULT_ACCOUNT.equals(account.name) ? ld.b.a(aVar.getContext()).b() : null;
            Integer num = aVar.f8858d;
            com.google.android.gms.common.internal.e0.i(num);
            com.google.android.gms.common.internal.z zVar = new com.google.android.gms.common.internal.z(2, account, num.intValue(), googleSignInAccountB);
            je.d dVar = (je.d) aVar.getService();
            je.f fVar = new je.f(1, zVar);
            Parcel parcelZaa = dVar.zaa();
            zac.zac(parcelZaa, fVar);
            zac.zad(parcelZaa, this);
            dVar.zac(12, parcelZaa);
        } catch (RemoteException e10) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.f3579b.post(new a1(3, this, new je.g(1, new nd.b(8, null), null)));
            } catch (RemoteException unused) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e10);
            }
        }
    }

    @Override // com.google.android.gms.common.api.internal.q
    public final void onConnectionFailed(nd.b bVar) {
        this.f3584z.b(bVar);
    }

    @Override // com.google.android.gms.common.api.internal.g
    public final void onConnectionSuspended(int i10) {
        i0 i0Var = this.f3584z;
        g0 g0Var = (g0) ((h) i0Var.f3556f).C.get((a) i0Var.f3553c);
        if (g0Var != null) {
            if (g0Var.B) {
                g0Var.o(new nd.b(17));
            } else {
                g0Var.onConnectionSuspended(i10);
            }
        }
    }
}
