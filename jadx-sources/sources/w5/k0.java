package w5;

import android.util.Log;
import androidx.lifecycle.a1;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 extends x0 {

    /* renamed from: h, reason: collision with root package name */
    public static final g6.c f18675h = new g6.c(1);

    /* renamed from: e, reason: collision with root package name */
    public final boolean f18679e;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap f18676b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final HashMap f18677c = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f18678d = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    public boolean f18680f = false;

    /* renamed from: g, reason: collision with root package name */
    public boolean f18681g = false;

    public k0(boolean z2) {
        this.f18679e = z2;
    }

    @Override // androidx.lifecycle.x0
    public final void d() {
        if (i0.J(3)) {
            Log.d("FragmentManager", "onCleared called for " + this);
        }
        this.f18680f = true;
    }

    public final void e(String str, boolean z2) {
        if (i0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for saved state of Fragment " + str);
        }
        g(str, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && k0.class == obj.getClass()) {
            k0 k0Var = (k0) obj;
            if (this.f18676b.equals(k0Var.f18676b) && this.f18677c.equals(k0Var.f18677c) && this.f18678d.equals(k0Var.f18678d)) {
                return true;
            }
        }
        return false;
    }

    public final void f(t tVar, boolean z2) {
        if (i0.J(3)) {
            Log.d("FragmentManager", "Clearing non-config state for " + tVar);
        }
        g(tVar.f18761e, z2);
    }

    public final void g(String str, boolean z2) {
        HashMap map = this.f18677c;
        k0 k0Var = (k0) map.get(str);
        if (k0Var != null) {
            if (z2) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(k0Var.f18677c.keySet());
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    k0Var.e((String) obj, true);
                }
            }
            k0Var.d();
            map.remove(str);
        }
        HashMap map2 = this.f18678d;
        a1 a1Var = (a1) map2.get(str);
        if (a1Var != null) {
            a1Var.a();
            map2.remove(str);
        }
    }

    public final void h(t tVar) {
        if (this.f18681g) {
            if (i0.J(2)) {
                Log.v("FragmentManager", "Ignoring removeRetainedFragment as the state is already saved");
            }
        } else {
            if (this.f18676b.remove(tVar.f18761e) == null || !i0.J(2)) {
                return;
            }
            Log.v("FragmentManager", "Updating retained Fragments: Removed " + tVar);
        }
    }

    public final int hashCode() {
        return this.f18678d.hashCode() + ((this.f18677c.hashCode() + (this.f18676b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("FragmentManagerViewModel{");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("} Fragments (");
        Iterator it = this.f18676b.values().iterator();
        while (it.hasNext()) {
            sb2.append(it.next());
            if (it.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") Child Non Config (");
        Iterator it2 = this.f18677c.keySet().iterator();
        while (it2.hasNext()) {
            sb2.append((String) it2.next());
            if (it2.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(") ViewModelStores (");
        Iterator it3 = this.f18678d.keySet().iterator();
        while (it3.hasNext()) {
            sb2.append((String) it3.next());
            if (it3.hasNext()) {
                sb2.append(", ");
            }
        }
        sb2.append(')');
        return sb2.toString();
    }
}
