package w5;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.MenuItem;
import android.view.View;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class w extends c.m implements h4.a {
    public boolean O;
    public boolean P;
    public final ag.i M = new ag.i(new v(this), 29);
    public final androidx.lifecycle.v N = new androidx.lifecycle.v(this, true);
    public boolean Q = true;

    public w() {
        ((mh.g) this.f1843d.f15364c).z("android:support:lifecycle", new c.g(this, 3));
        final int i10 = 0;
        i(new s4.a(this) { // from class: w5.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f18775b;

            {
                this.f18775b = this;
            }

            @Override // s4.a
            public final void accept(Object obj) {
                switch (i10) {
                    case 0:
                        this.f18775b.M.D();
                        break;
                    default:
                        this.f18775b.M.D();
                        break;
                }
            }
        });
        final int i11 = 1;
        this.E.add(new s4.a(this) { // from class: w5.u

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ w f18775b;

            {
                this.f18775b = this;
            }

            @Override // s4.a
            public final void accept(Object obj) {
                switch (i11) {
                    case 0:
                        this.f18775b.M.D();
                        break;
                    default:
                        this.f18775b.M.D();
                        break;
                }
            }
        });
        c.h hVar = new c.h(this, 1);
        f.a aVar = this.f1841b;
        aVar.getClass();
        c.m mVar = aVar.f6098b;
        if (mVar != null) {
            hVar.a(mVar);
        }
        aVar.f6097a.add(hVar);
    }

    public static boolean n(i0 i0Var) {
        androidx.lifecycle.o oVar = androidx.lifecycle.o.f1111a;
        boolean zN = false;
        for (t tVar : i0Var.f18643c.z()) {
            if (tVar != null) {
                v vVar = tVar.N;
                if ((vVar == null ? null : vVar.A) != null) {
                    zN |= n(tVar.l());
                }
                p0 p0Var = tVar.f18767i0;
                if (p0Var != null) {
                    p0Var.d();
                    if (p0Var.f18723d.f1141c.compareTo(androidx.lifecycle.o.f1114d) >= 0) {
                        tVar.f18767i0.f18723d.g();
                        zN = true;
                    }
                }
                if (tVar.f18766h0.f1141c.compareTo(androidx.lifecycle.o.f1114d) >= 0) {
                    tVar.f18766h0.g();
                    zN = true;
                }
            }
        }
        return zN;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r4, java.io.FileDescriptor r5, java.io.PrintWriter r6, java.lang.String[] r7) {
        /*
            r3 = this;
            super.dump(r4, r5, r6, r7)
            if (r7 == 0) goto L56
            int r0 = r7.length
            if (r0 != 0) goto L9
            goto L56
        L9:
            r0 = 0
            r0 = r7[r0]
            int r1 = r0.hashCode()
            switch(r1) {
                case -645125871: goto L46;
                case 100470631: goto L36;
                case 472614934: goto L2d;
                case 1159329357: goto L1d;
                case 1455016274: goto L14;
                default: goto L13;
            }
        L13:
            goto L56
        L14:
            java.lang.String r1 = "--autofill"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L55
            goto L56
        L1d:
            java.lang.String r1 = "--contentcapture"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L26
            goto L56
        L26:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 29
            if (r0 < r1) goto L56
            goto L55
        L2d:
            java.lang.String r1 = "--list-dumpables"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L56
        L36:
            java.lang.String r1 = "--dump-dumpable"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L3f
            goto L56
        L3f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L56
            goto L55
        L46:
            java.lang.String r1 = "--translation"
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L4f
            goto L56
        L4f:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L56
        L55:
            return
        L56:
            r6.print(r4)
            java.lang.String r0 = "Local FragmentActivity "
            r6.print(r0)
            int r0 = java.lang.System.identityHashCode(r3)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r6.print(r0)
            java.lang.String r0 = " State:"
            r6.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.print(r0)
            java.lang.String r1 = "mCreated="
            r6.print(r1)
            boolean r1 = r3.O
            r6.print(r1)
            java.lang.String r1 = " mResumed="
            r6.print(r1)
            boolean r1 = r3.P
            r6.print(r1)
            java.lang.String r1 = " mStopped="
            r6.print(r1)
            boolean r1 = r3.Q
            r6.print(r1)
            android.app.Application r1 = r3.getApplication()
            if (r1 == 0) goto Lb2
            t0.j r1 = new t0.j
            androidx.lifecycle.a1 r2 = r3.e()
            r1.<init>(r3, r2)
            r1.j(r0, r6)
        Lb2:
            ag.i r0 = r3.M
            java.lang.Object r0 = r0.f449b
            w5.v r0 = (w5.v) r0
            w5.i0 r0 = r0.f18779z
            r0.v(r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w5.w.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // c.m, android.app.Activity
    public void onActivityResult(int i10, int i11, Intent intent) {
        this.M.D();
        super.onActivityResult(i10, i11, intent);
    }

    @Override // c.m, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.N.d(androidx.lifecycle.n.ON_CREATE);
        i0 i0Var = ((v) this.M.f449b).f18779z;
        i0Var.H = false;
        i0Var.I = false;
        i0Var.O.f18681g = false;
        i0Var.u(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((v) this.M.f449b).f18779z.f18646f.onCreateView(view, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(view, str, context, attributeSet) : viewOnCreateView;
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        ((v) this.M.f449b).f18779z.l();
        this.N.d(androidx.lifecycle.n.ON_DESTROY);
    }

    @Override // c.m, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i10, MenuItem menuItem) {
        if (super.onMenuItemSelected(i10, menuItem)) {
            return true;
        }
        if (i10 == 6) {
            return ((v) this.M.f449b).f18779z.j();
        }
        return false;
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.P = false;
        ((v) this.M.f449b).f18779z.u(5);
        this.N.d(androidx.lifecycle.n.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        super.onPostResume();
        this.N.d(androidx.lifecycle.n.ON_RESUME);
        i0 i0Var = ((v) this.M.f449b).f18779z;
        i0Var.H = false;
        i0Var.I = false;
        i0Var.O.f18681g = false;
        i0Var.u(7);
    }

    @Override // c.m, android.app.Activity
    public final void onRequestPermissionsResult(int i10, String[] strArr, int[] iArr) {
        this.M.D();
        super.onRequestPermissionsResult(i10, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        ag.i iVar = this.M;
        iVar.D();
        super.onResume();
        this.P = true;
        ((v) iVar.f449b).f18779z.z(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        ag.i iVar = this.M;
        iVar.D();
        v vVar = (v) iVar.f449b;
        super.onStart();
        this.Q = false;
        if (!this.O) {
            this.O = true;
            i0 i0Var = vVar.f18779z;
            i0Var.H = false;
            i0Var.I = false;
            i0Var.O.f18681g = false;
            i0Var.u(4);
        }
        vVar.f18779z.z(true);
        this.N.d(androidx.lifecycle.n.ON_START);
        i0 i0Var2 = vVar.f18779z;
        i0Var2.H = false;
        i0Var2.I = false;
        i0Var2.O.f18681g = false;
        i0Var2.u(5);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.M.D();
    }

    @Override // android.app.Activity
    public final void onStop() {
        ag.i iVar;
        i0 i0Var;
        super.onStop();
        this.Q = true;
        do {
            iVar = this.M;
            i0Var = ((v) iVar.f449b).f18779z;
            androidx.lifecycle.o oVar = androidx.lifecycle.o.f1111a;
        } while (n(i0Var));
        i0 i0Var2 = ((v) iVar.f449b).f18779z;
        i0Var2.I = true;
        i0Var2.O.f18681g = true;
        i0Var2.u(4);
        this.N.d(androidx.lifecycle.n.ON_STOP);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View viewOnCreateView = ((v) this.M.f449b).f18779z.f18646f.onCreateView(null, str, context, attributeSet);
        return viewOnCreateView == null ? super.onCreateView(str, context, attributeSet) : viewOnCreateView;
    }
}
