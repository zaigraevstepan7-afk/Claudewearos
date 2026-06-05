package w5;

import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.a1;
import androidx.lifecycle.b1;
import androidx.lifecycle.y0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import t.m1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class t implements ComponentCallbacks, View.OnCreateContextMenuListener, androidx.lifecycle.t, b1, androidx.lifecycle.j, a7.f {

    /* renamed from: n0, reason: collision with root package name */
    public static final Object f18752n0 = new Object();
    public int B;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public int L;
    public i0 M;
    public v N;
    public t P;
    public int Q;
    public int R;
    public String S;
    public boolean T;
    public boolean U;
    public boolean V;
    public boolean X;
    public ViewGroup Y;
    public View Z;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f18754a0;

    /* renamed from: b, reason: collision with root package name */
    public Bundle f18755b;

    /* renamed from: c, reason: collision with root package name */
    public SparseArray f18757c;

    /* renamed from: c0, reason: collision with root package name */
    public s f18758c0;

    /* renamed from: d, reason: collision with root package name */
    public Bundle f18759d;

    /* renamed from: d0, reason: collision with root package name */
    public boolean f18760d0;

    /* renamed from: e0, reason: collision with root package name */
    public boolean f18762e0;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f18763f;

    /* renamed from: f0, reason: collision with root package name */
    public String f18764f0;

    /* renamed from: g0, reason: collision with root package name */
    public androidx.lifecycle.o f18765g0;

    /* renamed from: h0, reason: collision with root package name */
    public androidx.lifecycle.v f18766h0;

    /* renamed from: i0, reason: collision with root package name */
    public p0 f18767i0;

    /* renamed from: j0, reason: collision with root package name */
    public final androidx.lifecycle.b0 f18768j0;

    /* renamed from: k0, reason: collision with root package name */
    public t0.j f18769k0;

    /* renamed from: l0, reason: collision with root package name */
    public final ArrayList f18770l0;

    /* renamed from: m0, reason: collision with root package name */
    public final q f18771m0;

    /* renamed from: z, reason: collision with root package name */
    public t f18772z;

    /* renamed from: a, reason: collision with root package name */
    public int f18753a = -1;

    /* renamed from: e, reason: collision with root package name */
    public String f18761e = UUID.randomUUID().toString();
    public String A = null;
    public Boolean C = null;
    public i0 O = new i0();
    public final boolean W = true;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f18756b0 = true;

    public t() {
        new t7.s(this, 3);
        this.f18765g0 = androidx.lifecycle.o.f1115e;
        this.f18768j0 = new androidx.lifecycle.b0();
        new AtomicInteger();
        this.f18770l0 = new ArrayList();
        this.f18771m0 = new q(this);
        p();
    }

    public void A() {
        this.X = true;
    }

    public LayoutInflater B(Bundle bundle) {
        v vVar = this.N;
        if (vVar == null) {
            throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
        }
        w wVar = vVar.A;
        LayoutInflater layoutInflaterCloneInContext = wVar.getLayoutInflater().cloneInContext(wVar);
        layoutInflaterCloneInContext.setFactory2(this.O.f18646f);
        return layoutInflaterCloneInContext;
    }

    public void C() {
        this.X = true;
    }

    public abstract void D(Bundle bundle);

    public void E() {
        this.X = true;
    }

    public void F() {
        this.X = true;
    }

    public void G(Bundle bundle) {
        this.X = true;
    }

    public void H(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.O.P();
        this.K = true;
        this.f18767i0 = new p0(this, e(), new ac.o(this, 24));
        View viewX = x(layoutInflater, viewGroup);
        this.Z = viewX;
        if (viewX == null) {
            if (this.f18767i0.f18723d != null) {
                throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
            }
            this.f18767i0 = null;
            return;
        }
        this.f18767i0.d();
        if (i0.J(3)) {
            Log.d("FragmentManager", "Setting ViewLifecycleOwner on View " + this.Z + " for Fragment " + this);
        }
        androidx.lifecycle.r0.i(this.Z, this.f18767i0);
        androidx.lifecycle.r0.j(this.Z, this.f18767i0);
        uk.c.P(this.Z, this.f18767i0);
        this.f18768j0.i(this.f18767i0);
    }

    public final Context I() {
        Context contextM = m();
        if (contextM != null) {
            return contextM;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final View J() {
        View view = this.Z;
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    public final void K() {
        Bundle bundle;
        Bundle bundle2 = this.f18755b;
        if (bundle2 == null || (bundle = bundle2.getBundle("childFragmentManager")) == null) {
            return;
        }
        this.O.V(bundle);
        i0 i0Var = this.O;
        i0Var.H = false;
        i0Var.I = false;
        i0Var.O.f18681g = false;
        i0Var.u(1);
    }

    public final void L(int i10, int i11, int i12, int i13) {
        if (this.f18758c0 == null && i10 == 0 && i11 == 0 && i12 == 0 && i13 == 0) {
            return;
        }
        k().f18732b = i10;
        k().f18733c = i11;
        k().f18734d = i12;
        k().f18735e = i13;
    }

    public final void M(Bundle bundle) {
        i0 i0Var = this.M;
        if (i0Var != null && (i0Var.H || i0Var.I)) {
            throw new IllegalStateException("Fragment already added and state has been saved");
        }
        this.f18763f = bundle;
    }

    @Override // androidx.lifecycle.j
    public final d6.c c() {
        Application application;
        Context applicationContext = I().getApplicationContext();
        while (true) {
            if (!(applicationContext instanceof ContextWrapper)) {
                application = null;
                break;
            }
            if (applicationContext instanceof Application) {
                application = (Application) applicationContext;
                break;
            }
            applicationContext = ((ContextWrapper) applicationContext).getBaseContext();
        }
        if (application == null && i0.J(3)) {
            Log.d("FragmentManager", "Could not find Application instance from Context " + I().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        d6.c cVar = new d6.c(0);
        LinkedHashMap linkedHashMap = cVar.f4977a;
        if (application != null) {
            linkedHashMap.put(y0.f1158f, application);
        }
        linkedHashMap.put(androidx.lifecycle.r0.f1122a, this);
        linkedHashMap.put(androidx.lifecycle.r0.f1123b, this);
        Bundle bundle = this.f18763f;
        if (bundle != null) {
            linkedHashMap.put(androidx.lifecycle.r0.f1124c, bundle);
        }
        return cVar;
    }

    @Override // androidx.lifecycle.b1
    public final a1 e() {
        if (this.M == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        }
        int iN = n();
        androidx.lifecycle.o oVar = androidx.lifecycle.o.f1111a;
        if (iN == 1) {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
        HashMap map = this.M.O.f18678d;
        a1 a1Var = (a1) map.get(this.f18761e);
        if (a1Var != null) {
            return a1Var;
        }
        a1 a1Var2 = new a1();
        map.put(this.f18761e, a1Var2);
        return a1Var2;
    }

    @Override // a7.f
    public final mh.g g() {
        return (mh.g) this.f18769k0.f15364c;
    }

    @Override // androidx.lifecycle.t
    public final androidx.lifecycle.v h() {
        return this.f18766h0;
    }

    public u1.b i() {
        return new r(this);
    }

    public void j(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String str2;
        printWriter.print(str);
        printWriter.print("mFragmentId=#");
        printWriter.print(Integer.toHexString(this.Q));
        printWriter.print(" mContainerId=#");
        printWriter.print(Integer.toHexString(this.R));
        printWriter.print(" mTag=");
        printWriter.println(this.S);
        printWriter.print(str);
        printWriter.print("mState=");
        printWriter.print(this.f18753a);
        printWriter.print(" mWho=");
        printWriter.print(this.f18761e);
        printWriter.print(" mBackStackNesting=");
        printWriter.println(this.L);
        printWriter.print(str);
        printWriter.print("mAdded=");
        printWriter.print(this.D);
        printWriter.print(" mRemoving=");
        printWriter.print(this.E);
        printWriter.print(" mFromLayout=");
        printWriter.print(this.G);
        printWriter.print(" mInLayout=");
        printWriter.println(this.H);
        printWriter.print(str);
        printWriter.print("mHidden=");
        printWriter.print(this.T);
        printWriter.print(" mDetached=");
        printWriter.print(this.U);
        printWriter.print(" mMenuVisible=");
        printWriter.print(this.W);
        printWriter.print(" mHasMenu=");
        printWriter.println(false);
        printWriter.print(str);
        printWriter.print("mRetainInstance=");
        printWriter.print(this.V);
        printWriter.print(" mUserVisibleHint=");
        printWriter.println(this.f18756b0);
        if (this.M != null) {
            printWriter.print(str);
            printWriter.print("mFragmentManager=");
            printWriter.println(this.M);
        }
        if (this.N != null) {
            printWriter.print(str);
            printWriter.print("mHost=");
            printWriter.println(this.N);
        }
        if (this.P != null) {
            printWriter.print(str);
            printWriter.print("mParentFragment=");
            printWriter.println(this.P);
        }
        if (this.f18763f != null) {
            printWriter.print(str);
            printWriter.print("mArguments=");
            printWriter.println(this.f18763f);
        }
        if (this.f18755b != null) {
            printWriter.print(str);
            printWriter.print("mSavedFragmentState=");
            printWriter.println(this.f18755b);
        }
        if (this.f18757c != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewState=");
            printWriter.println(this.f18757c);
        }
        if (this.f18759d != null) {
            printWriter.print(str);
            printWriter.print("mSavedViewRegistryState=");
            printWriter.println(this.f18759d);
        }
        t tVarS = this.f18772z;
        if (tVarS == null) {
            i0 i0Var = this.M;
            tVarS = (i0Var == null || (str2 = this.A) == null) ? null : i0Var.f18643c.s(str2);
        }
        if (tVarS != null) {
            printWriter.print(str);
            printWriter.print("mTarget=");
            printWriter.print(tVarS);
            printWriter.print(" mTargetRequestCode=");
            printWriter.println(this.B);
        }
        printWriter.print(str);
        printWriter.print("mPopDirection=");
        s sVar = this.f18758c0;
        printWriter.println(sVar == null ? false : sVar.f18731a);
        s sVar2 = this.f18758c0;
        if ((sVar2 == null ? 0 : sVar2.f18732b) != 0) {
            printWriter.print(str);
            printWriter.print("getEnterAnim=");
            s sVar3 = this.f18758c0;
            printWriter.println(sVar3 == null ? 0 : sVar3.f18732b);
        }
        s sVar4 = this.f18758c0;
        if ((sVar4 == null ? 0 : sVar4.f18733c) != 0) {
            printWriter.print(str);
            printWriter.print("getExitAnim=");
            s sVar5 = this.f18758c0;
            printWriter.println(sVar5 == null ? 0 : sVar5.f18733c);
        }
        s sVar6 = this.f18758c0;
        if ((sVar6 == null ? 0 : sVar6.f18734d) != 0) {
            printWriter.print(str);
            printWriter.print("getPopEnterAnim=");
            s sVar7 = this.f18758c0;
            printWriter.println(sVar7 == null ? 0 : sVar7.f18734d);
        }
        s sVar8 = this.f18758c0;
        if ((sVar8 == null ? 0 : sVar8.f18735e) != 0) {
            printWriter.print(str);
            printWriter.print("getPopExitAnim=");
            s sVar9 = this.f18758c0;
            printWriter.println(sVar9 != null ? sVar9.f18735e : 0);
        }
        if (this.Y != null) {
            printWriter.print(str);
            printWriter.print("mContainer=");
            printWriter.println(this.Y);
        }
        if (this.Z != null) {
            printWriter.print(str);
            printWriter.print("mView=");
            printWriter.println(this.Z);
        }
        if (m() != null) {
            new t0.j(this, e()).j(str, printWriter);
        }
        printWriter.print(str);
        printWriter.println("Child " + this.O + ":");
        this.O.v(m1.v(str, "  "), fileDescriptor, printWriter, strArr);
    }

    public final s k() {
        if (this.f18758c0 == null) {
            s sVar = new s();
            Object obj = f18752n0;
            sVar.f18737g = obj;
            sVar.f18738h = obj;
            sVar.f18739i = obj;
            sVar.j = 1.0f;
            sVar.f18740k = null;
            this.f18758c0 = sVar;
        }
        return this.f18758c0;
    }

    public final i0 l() {
        if (this.N != null) {
            return this.O;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Context m() {
        v vVar = this.N;
        if (vVar == null) {
            return null;
        }
        return vVar.f18777e;
    }

    public final int n() {
        androidx.lifecycle.o oVar = this.f18765g0;
        return (oVar == androidx.lifecycle.o.f1112b || this.P == null) ? oVar.ordinal() : Math.min(oVar.ordinal(), this.P.n());
    }

    public final i0 o() {
        i0 i0Var = this.M;
        if (i0Var != null) {
            return i0Var;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        this.X = true;
    }

    @Override // android.view.View.OnCreateContextMenuListener
    public final void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        v vVar = this.N;
        w wVar = vVar == null ? null : vVar.f18776d;
        if (wVar != null) {
            wVar.onCreateContextMenu(contextMenu, view, contextMenuInfo);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        this.X = true;
    }

    public final void p() {
        this.f18766h0 = new androidx.lifecycle.v(this, true);
        this.f18769k0 = new t0.j(new c7.b(this, new a7.e(this, 0)));
        ArrayList arrayList = this.f18770l0;
        q qVar = this.f18771m0;
        if (arrayList.contains(qVar)) {
            return;
        }
        if (this.f18753a < 0) {
            arrayList.add(qVar);
            return;
        }
        t tVar = qVar.f18725a;
        ((c7.b) tVar.f18769k0.f15363b).a();
        androidx.lifecycle.r0.d(tVar);
        Bundle bundle = tVar.f18755b;
        tVar.f18769k0.r(bundle != null ? bundle.getBundle("registryState") : null);
    }

    public final void q() {
        p();
        this.f18764f0 = this.f18761e;
        this.f18761e = UUID.randomUUID().toString();
        this.D = false;
        this.E = false;
        this.G = false;
        this.H = false;
        this.J = false;
        this.L = 0;
        this.M = null;
        this.O = new i0();
        this.N = null;
        this.Q = 0;
        this.R = 0;
        this.S = null;
        this.T = false;
        this.U = false;
    }

    public final boolean r() {
        if (this.T) {
            return true;
        }
        i0 i0Var = this.M;
        if (i0Var != null) {
            t tVar = this.P;
            i0Var.getClass();
            if (tVar == null ? false : tVar.r()) {
                return true;
            }
        }
        return false;
    }

    public final boolean s() {
        return this.L > 0;
    }

    public final void startActivityForResult(Intent intent, int i10) {
        if (this.N == null) {
            throw new IllegalStateException("Fragment " + this + " not attached to Activity");
        }
        i0 i0VarO = o();
        if (i0VarO.C != null) {
            String str = this.f18761e;
            e0 e0Var = new e0();
            e0Var.f18625a = str;
            e0Var.f18626b = i10;
            i0VarO.F.addLast(e0Var);
            i0VarO.C.a0(intent);
            return;
        }
        v vVar = i0VarO.f18662w;
        vVar.getClass();
        fj.l.f(intent, "intent");
        if (i10 != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        i4.c.startActivity(vVar.f18777e, intent, null);
    }

    public void t() {
        this.X = true;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append(getClass().getSimpleName());
        sb2.append("{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} (");
        sb2.append(this.f18761e);
        if (this.Q != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.Q));
        }
        if (this.S != null) {
            sb2.append(" tag=");
            sb2.append(this.S);
        }
        sb2.append(")");
        return sb2.toString();
    }

    public void u(int i10, int i11, Intent intent) {
        if (i0.J(2)) {
            Log.v("FragmentManager", "Fragment " + this + " received the following in onActivityResult(): requestCode: " + i10 + " resultCode: " + i11 + " data: " + intent);
        }
    }

    public void v(Context context) {
        this.X = true;
        v vVar = this.N;
        if ((vVar == null ? null : vVar.f18776d) != null) {
            this.X = true;
        }
    }

    public void w(Bundle bundle) {
        this.X = true;
        K();
        i0 i0Var = this.O;
        if (i0Var.f18661v >= 1) {
            return;
        }
        i0Var.H = false;
        i0Var.I = false;
        i0Var.O.f18681g = false;
        i0Var.u(1);
    }

    public View x(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void y() {
        this.X = true;
    }

    public void z() {
        this.X = true;
    }
}
