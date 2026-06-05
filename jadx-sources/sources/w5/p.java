package w5;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class p extends t implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public boolean A0;
    public boolean B0;

    /* renamed from: o0, reason: collision with root package name */
    public final qc.j f18712o0;

    /* renamed from: p0, reason: collision with root package name */
    public final n f18713p0;

    /* renamed from: q0, reason: collision with root package name */
    public int f18714q0;

    /* renamed from: r0, reason: collision with root package name */
    public int f18715r0;

    /* renamed from: s0, reason: collision with root package name */
    public boolean f18716s0;

    /* renamed from: t0, reason: collision with root package name */
    public boolean f18717t0;

    /* renamed from: u0, reason: collision with root package name */
    public int f18718u0;

    /* renamed from: v0, reason: collision with root package name */
    public boolean f18719v0;
    public final ld.i w0;
    public Dialog x0;
    public boolean y0;
    public boolean z0;

    public p() {
        new t7.s(this, 2);
        this.f18712o0 = new qc.j(this, 1);
        this.f18713p0 = new n(this);
        this.f18714q0 = 0;
        this.f18715r0 = 0;
        this.f18716s0 = true;
        this.f18717t0 = true;
        this.f18718u0 = -1;
        this.w0 = new ld.i(this, 27);
        this.B0 = false;
    }

    @Override // w5.t
    public final void A() {
        this.X = true;
        if (!this.A0 && !this.z0) {
            this.z0 = true;
        }
        this.f18768j0.h(this.w0);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0044 A[Catch: all -> 0x004c, TryCatch #0 {all -> 0x004c, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0044, B:29:0x004e, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0066), top: B:49:0x001a }] */
    @Override // w5.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater B(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.B(r8)
            boolean r0 = r7.f18717t0
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L98
            boolean r3 = r7.f18719v0
            if (r3 == 0) goto L11
            goto L98
        L11:
            if (r0 != 0) goto L14
            goto L6f
        L14:
            boolean r0 = r7.B0
            if (r0 != 0) goto L6f
            r0 = 0
            r3 = 1
            r7.f18719v0 = r3     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.N()     // Catch: java.lang.Throwable -> L4c
            r7.x0 = r4     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f18717t0     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L66
            int r5 = r7.f18714q0     // Catch: java.lang.Throwable -> L4c
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4c
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4c
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4c
        L3e:
            android.content.Context r4 = r7.m()     // Catch: java.lang.Throwable -> L4c
            if (r4 == 0) goto L4e
            android.app.Dialog r5 = r7.x0     // Catch: java.lang.Throwable -> L4c
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4c
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4c
            goto L4e
        L4c:
            r8 = move-exception
            goto L6c
        L4e:
            android.app.Dialog r4 = r7.x0     // Catch: java.lang.Throwable -> L4c
            boolean r5 = r7.f18716s0     // Catch: java.lang.Throwable -> L4c
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.x0     // Catch: java.lang.Throwable -> L4c
            qc.j r5 = r7.f18712o0     // Catch: java.lang.Throwable -> L4c
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4c
            android.app.Dialog r4 = r7.x0     // Catch: java.lang.Throwable -> L4c
            w5.n r5 = r7.f18713p0     // Catch: java.lang.Throwable -> L4c
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4c
            r7.B0 = r3     // Catch: java.lang.Throwable -> L4c
            goto L69
        L66:
            r3 = 0
            r7.x0 = r3     // Catch: java.lang.Throwable -> L4c
        L69:
            r7.f18719v0 = r0
            goto L6f
        L6c:
            r7.f18719v0 = r0
            throw r8
        L6f:
            boolean r0 = w5.i0.J(r2)
            if (r0 == 0) goto L8b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "get layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r2 = " from dialog context"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r1, r0)
        L8b:
            android.app.Dialog r0 = r7.x0
            if (r0 == 0) goto Ld3
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
            return r8
        L98:
            boolean r0 = w5.i0.J(r2)
            if (r0 == 0) goto Ld3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r2 = "getting layout inflater for DialogFragment "
            r0.<init>(r2)
            r0.append(r7)
            java.lang.String r0 = r0.toString()
            boolean r2 = r7.f18717t0
            if (r2 != 0) goto Lc2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mShowsDialog = false: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
            return r8
        Lc2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "mCreatingDialog = true: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            android.util.Log.d(r1, r0)
        Ld3:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.p.B(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // w5.t
    public void D(Bundle bundle) {
        Dialog dialog = this.x0;
        if (dialog != null) {
            Bundle bundleOnSaveInstanceState = dialog.onSaveInstanceState();
            bundleOnSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", bundleOnSaveInstanceState);
        }
        int i10 = this.f18714q0;
        if (i10 != 0) {
            bundle.putInt("android:style", i10);
        }
        int i11 = this.f18715r0;
        if (i11 != 0) {
            bundle.putInt("android:theme", i11);
        }
        boolean z2 = this.f18716s0;
        if (!z2) {
            bundle.putBoolean("android:cancelable", z2);
        }
        boolean z10 = this.f18717t0;
        if (!z10) {
            bundle.putBoolean("android:showsDialog", z10);
        }
        int i12 = this.f18718u0;
        if (i12 != -1) {
            bundle.putInt("android:backStackId", i12);
        }
    }

    @Override // w5.t
    public void E() {
        this.X = true;
        Dialog dialog = this.x0;
        if (dialog != null) {
            this.y0 = false;
            dialog.show();
            View decorView = this.x0.getWindow().getDecorView();
            androidx.lifecycle.r0.i(decorView, this);
            androidx.lifecycle.r0.j(decorView, this);
            uk.c.P(decorView, this);
        }
    }

    @Override // w5.t
    public void F() {
        this.X = true;
        Dialog dialog = this.x0;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // w5.t
    public final void G(Bundle bundle) {
        Bundle bundle2;
        this.X = true;
        if (this.x0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.x0.onRestoreInstanceState(bundle2);
    }

    @Override // w5.t
    public final void H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.H(layoutInflater, viewGroup, bundle);
        if (this.Z != null || this.x0 == null || bundle == null || (bundle2 = bundle.getBundle("android:savedDialogState")) == null) {
            return;
        }
        this.x0.onRestoreInstanceState(bundle2);
    }

    public Dialog N() {
        if (i0.J(3)) {
            Log.d("FragmentManager", "onCreateDialog called for DialogFragment " + this);
        }
        return new c.o(I(), this.f18715r0);
    }

    @Override // w5.t
    public final u1.b i() {
        return new o(this, new r(this));
    }

    public void onDismiss(DialogInterface dialogInterface) {
        if (this.y0) {
            return;
        }
        if (i0.J(3)) {
            Log.d("FragmentManager", "onDismiss called for DialogFragment " + this);
        }
        if (this.z0) {
            return;
        }
        this.z0 = true;
        this.A0 = false;
        Dialog dialog = this.x0;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.x0.dismiss();
        }
        this.y0 = true;
        if (this.f18718u0 >= 0) {
            i0 i0VarO = o();
            int i10 = this.f18718u0;
            if (i10 < 0) {
                throw new IllegalArgumentException(m6.a.d(i10, "Bad id: "));
            }
            i0VarO.x(new g0(i0VarO, i10), true);
            this.f18718u0 = -1;
            return;
        }
        a aVar = new a(o());
        aVar.f18599o = true;
        i0 i0Var = this.M;
        if (i0Var == null || i0Var == aVar.f18601q) {
            aVar.b(new o0(3, this));
            aVar.e(true, true);
        } else {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
    }

    @Override // w5.t
    public final void t() {
        this.X = true;
    }

    @Override // w5.t
    public final void v(Context context) {
        Object obj;
        super.v(context);
        androidx.lifecycle.b0 b0Var = this.f18768j0;
        b0Var.getClass();
        androidx.lifecycle.b0.a("observeForever");
        ld.i iVar = this.w0;
        androidx.lifecycle.y yVar = new androidx.lifecycle.y(b0Var, iVar);
        o.f fVar = b0Var.f1066b;
        o.c cVarB = fVar.b(iVar);
        if (cVarB != null) {
            obj = cVarB.f12356b;
        } else {
            o.c cVar = new o.c(iVar, yVar);
            fVar.f12365d++;
            o.c cVar2 = fVar.f12363b;
            if (cVar2 == null) {
                fVar.f12362a = cVar;
                fVar.f12363b = cVar;
            } else {
                cVar2.f12357c = cVar;
                cVar.f12358d = cVar2;
                fVar.f12363b = cVar;
            }
            obj = null;
        }
        androidx.lifecycle.a0 a0Var = (androidx.lifecycle.a0) obj;
        if (a0Var instanceof androidx.lifecycle.z) {
            throw new IllegalArgumentException("Cannot add the same observer with different lifecycles");
        }
        if (a0Var == null) {
            yVar.a(true);
        }
        if (this.A0) {
            return;
        }
        this.z0 = false;
    }

    @Override // w5.t
    public void w(Bundle bundle) {
        super.w(bundle);
        new Handler();
        this.f18717t0 = this.R == 0;
        if (bundle != null) {
            this.f18714q0 = bundle.getInt("android:style", 0);
            this.f18715r0 = bundle.getInt("android:theme", 0);
            this.f18716s0 = bundle.getBoolean("android:cancelable", true);
            this.f18717t0 = bundle.getBoolean("android:showsDialog", this.f18717t0);
            this.f18718u0 = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // w5.t
    public final void z() {
        this.X = true;
        Dialog dialog = this.x0;
        if (dialog != null) {
            this.y0 = true;
            dialog.setOnDismissListener(null);
            this.x0.dismiss();
            if (!this.z0) {
                onDismiss(this.x0);
            }
            this.x0 = null;
            this.B0 = false;
        }
    }

    public void onCancel(DialogInterface dialogInterface) {
    }
}
