package w5;

import android.util.Log;
import java.io.PrintWriter;
import java.lang.reflect.Modifier;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f18586a;

    /* renamed from: b, reason: collision with root package name */
    public int f18587b;

    /* renamed from: c, reason: collision with root package name */
    public int f18588c;

    /* renamed from: d, reason: collision with root package name */
    public int f18589d;

    /* renamed from: e, reason: collision with root package name */
    public int f18590e;

    /* renamed from: f, reason: collision with root package name */
    public int f18591f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18592g;

    /* renamed from: h, reason: collision with root package name */
    public String f18593h;

    /* renamed from: i, reason: collision with root package name */
    public int f18594i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public int f18595k;

    /* renamed from: l, reason: collision with root package name */
    public CharSequence f18596l;

    /* renamed from: m, reason: collision with root package name */
    public ArrayList f18597m;

    /* renamed from: n, reason: collision with root package name */
    public ArrayList f18598n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f18599o;

    /* renamed from: p, reason: collision with root package name */
    public ArrayList f18600p;

    /* renamed from: q, reason: collision with root package name */
    public final i0 f18601q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18602r;

    /* renamed from: s, reason: collision with root package name */
    public int f18603s;

    public a(i0 i0Var) {
        i0Var.G();
        v vVar = i0Var.f18662w;
        if (vVar != null) {
            vVar.f18777e.getClassLoader();
        }
        this.f18586a = new ArrayList();
        this.f18599o = false;
        this.f18603s = -1;
        this.f18601q = i0Var;
    }

    @Override // w5.f0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        if (i0.J(2)) {
            Log.v("FragmentManager", "Run: " + this);
        }
        arrayList.add(this);
        arrayList2.add(Boolean.FALSE);
        if (!this.f18592g) {
            return true;
        }
        this.f18601q.f18644d.add(this);
        return true;
    }

    public final void b(o0 o0Var) {
        this.f18586a.add(o0Var);
        o0Var.f18706d = this.f18587b;
        o0Var.f18707e = this.f18588c;
        o0Var.f18708f = this.f18589d;
        o0Var.f18709g = this.f18590e;
    }

    public final void c(int i10) {
        if (this.f18592g) {
            if (i0.J(2)) {
                Log.v("FragmentManager", "Bump nesting in " + this + " by " + i10);
            }
            ArrayList arrayList = this.f18586a;
            int size = arrayList.size();
            for (int i11 = 0; i11 < size; i11++) {
                o0 o0Var = (o0) arrayList.get(i11);
                t tVar = o0Var.f18704b;
                if (tVar != null) {
                    tVar.L += i10;
                    if (i0.J(2)) {
                        Log.v("FragmentManager", "Bump nesting of " + o0Var.f18704b + " to " + o0Var.f18704b.L);
                    }
                }
            }
        }
    }

    public final void d() {
        ArrayList arrayList = this.f18586a;
        int size = arrayList.size() - 1;
        while (size >= 0) {
            o0 o0Var = (o0) arrayList.get(size);
            if (o0Var.f18705c) {
                if (o0Var.f18703a == 8) {
                    o0Var.f18705c = false;
                    arrayList.remove(size - 1);
                    size--;
                } else {
                    int i10 = o0Var.f18704b.R;
                    o0Var.f18703a = 2;
                    o0Var.f18705c = false;
                    for (int i11 = size - 1; i11 >= 0; i11--) {
                        o0 o0Var2 = (o0) arrayList.get(i11);
                        if (o0Var2.f18705c && o0Var2.f18704b.R == i10) {
                            arrayList.remove(i11);
                            size--;
                        }
                    }
                }
            }
            size--;
        }
    }

    public final int e(boolean z2, boolean z10) {
        if (this.f18602r) {
            throw new IllegalStateException("commit already called");
        }
        if (i0.J(2)) {
            Log.v("FragmentManager", "Commit: " + this);
            PrintWriter printWriter = new PrintWriter(new q0());
            g("  ", printWriter, true);
            printWriter.close();
        }
        this.f18602r = true;
        boolean z11 = this.f18592g;
        i0 i0Var = this.f18601q;
        if (z11) {
            this.f18603s = i0Var.f18650k.getAndIncrement();
        } else {
            this.f18603s = -1;
        }
        if (z10) {
            i0Var.x(this, z2);
        }
        return this.f18603s;
    }

    public final void f(int i10, t tVar, String str, int i11) {
        String str2 = tVar.f18764f0;
        if (str2 != null) {
            x5.c.c(tVar, str2);
        }
        Class<?> cls = tVar.getClass();
        int modifiers = cls.getModifiers();
        if (cls.isAnonymousClass() || !Modifier.isPublic(modifiers) || (cls.isMemberClass() && !Modifier.isStatic(modifiers))) {
            throw new IllegalStateException("Fragment " + cls.getCanonicalName() + " must be a public static class to be  properly recreated from instance state.");
        }
        if (str != null) {
            String str3 = tVar.S;
            if (str3 != null && !str.equals(str3)) {
                throw new IllegalStateException("Can't change tag of fragment " + tVar + ": was " + tVar.S + " now " + str);
            }
            tVar.S = str;
        }
        if (i10 != 0) {
            if (i10 == -1) {
                throw new IllegalArgumentException("Can't add fragment " + tVar + " with tag " + str + " to container view with no id");
            }
            int i12 = tVar.Q;
            if (i12 != 0 && i12 != i10) {
                throw new IllegalStateException("Can't change container ID of fragment " + tVar + ": was " + tVar.Q + " now " + i10);
            }
            tVar.Q = i10;
            tVar.R = i10;
        }
        b(new o0(i11, tVar));
        tVar.M = this.f18601q;
    }

    public final void g(String str, PrintWriter printWriter, boolean z2) {
        String str2;
        if (z2) {
            printWriter.print(str);
            printWriter.print("mName=");
            printWriter.print(this.f18593h);
            printWriter.print(" mIndex=");
            printWriter.print(this.f18603s);
            printWriter.print(" mCommitted=");
            printWriter.println(this.f18602r);
            if (this.f18591f != 0) {
                printWriter.print(str);
                printWriter.print("mTransition=#");
                printWriter.print(Integer.toHexString(this.f18591f));
            }
            if (this.f18587b != 0 || this.f18588c != 0) {
                printWriter.print(str);
                printWriter.print("mEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18587b));
                printWriter.print(" mExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18588c));
            }
            if (this.f18589d != 0 || this.f18590e != 0) {
                printWriter.print(str);
                printWriter.print("mPopEnterAnim=#");
                printWriter.print(Integer.toHexString(this.f18589d));
                printWriter.print(" mPopExitAnim=#");
                printWriter.println(Integer.toHexString(this.f18590e));
            }
            if (this.f18594i != 0 || this.j != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18594i));
                printWriter.print(" mBreadCrumbTitleText=");
                printWriter.println(this.j);
            }
            if (this.f18595k != 0 || this.f18596l != null) {
                printWriter.print(str);
                printWriter.print("mBreadCrumbShortTitleRes=#");
                printWriter.print(Integer.toHexString(this.f18595k));
                printWriter.print(" mBreadCrumbShortTitleText=");
                printWriter.println(this.f18596l);
            }
        }
        ArrayList arrayList = this.f18586a;
        if (arrayList.isEmpty()) {
            return;
        }
        printWriter.print(str);
        printWriter.println("Operations:");
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = (o0) arrayList.get(i10);
            switch (o0Var.f18703a) {
                case 0:
                    str2 = "NULL";
                    break;
                case 1:
                    str2 = "ADD";
                    break;
                case 2:
                    str2 = "REPLACE";
                    break;
                case 3:
                    str2 = "REMOVE";
                    break;
                case 4:
                    str2 = "HIDE";
                    break;
                case 5:
                    str2 = "SHOW";
                    break;
                case 6:
                    str2 = "DETACH";
                    break;
                case 7:
                    str2 = "ATTACH";
                    break;
                case 8:
                    str2 = "SET_PRIMARY_NAV";
                    break;
                case 9:
                    str2 = "UNSET_PRIMARY_NAV";
                    break;
                case 10:
                    str2 = "OP_SET_MAX_LIFECYCLE";
                    break;
                default:
                    str2 = "cmd=" + o0Var.f18703a;
                    break;
            }
            printWriter.print(str);
            printWriter.print("  Op #");
            printWriter.print(i10);
            printWriter.print(": ");
            printWriter.print(str2);
            printWriter.print(" ");
            printWriter.println(o0Var.f18704b);
            if (z2) {
                if (o0Var.f18706d != 0 || o0Var.f18707e != 0) {
                    printWriter.print(str);
                    printWriter.print("enterAnim=#");
                    printWriter.print(Integer.toHexString(o0Var.f18706d));
                    printWriter.print(" exitAnim=#");
                    printWriter.println(Integer.toHexString(o0Var.f18707e));
                }
                if (o0Var.f18708f != 0 || o0Var.f18709g != 0) {
                    printWriter.print(str);
                    printWriter.print("popEnterAnim=#");
                    printWriter.print(Integer.toHexString(o0Var.f18708f));
                    printWriter.print(" popExitAnim=#");
                    printWriter.println(Integer.toHexString(o0Var.f18709g));
                }
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("BackStackEntry{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        if (this.f18603s >= 0) {
            sb2.append(" #");
            sb2.append(this.f18603s);
        }
        if (this.f18593h != null) {
            sb2.append(" ");
            sb2.append(this.f18593h);
        }
        sb2.append("}");
        return sb2.toString();
    }
}
