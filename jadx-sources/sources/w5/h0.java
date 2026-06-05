package w5;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class h0 implements f0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i0 f18638a;

    public h0(i0 i0Var) {
        this.f18638a = i0Var;
    }

    @Override // w5.f0
    public final boolean a(ArrayList arrayList, ArrayList arrayList2) {
        boolean zS;
        i0 i0Var = this.f18638a;
        ArrayList arrayList3 = i0Var.f18653n;
        if (i0.J(2)) {
            Log.v("FragmentManager", "FragmentManager has the following pending actions inside of prepareBackStackState: " + i0Var.f18641a);
        }
        int i10 = 0;
        if (i0Var.f18644d.isEmpty()) {
            Log.i("FragmentManager", "Ignoring call to start back stack pop because the back stack is empty.");
            zS = false;
        } else {
            ArrayList arrayList4 = i0Var.f18644d;
            a aVar = (a) arrayList4.get(arrayList4.size() - 1);
            i0Var.f18648h = aVar;
            ArrayList arrayList5 = aVar.f18586a;
            int size = arrayList5.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList5.get(i11);
                i11++;
                t tVar = ((o0) obj).f18704b;
                if (tVar != null) {
                    tVar.F = true;
                }
            }
            zS = i0Var.S(arrayList, arrayList2, -1, 0);
        }
        if (!arrayList3.isEmpty() && arrayList.size() > 0) {
            ((Boolean) arrayList2.get(arrayList.size() - 1)).getClass();
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            int size2 = arrayList.size();
            int i12 = 0;
            while (i12 < size2) {
                Object obj2 = arrayList.get(i12);
                i12++;
                linkedHashSet.addAll(i0.E((a) obj2));
            }
            int size3 = arrayList3.size();
            while (i10 < size3) {
                Object obj3 = arrayList3.get(i10);
                i10++;
                if (obj3 != null) {
                    throw new ClassCastException();
                }
                Iterator it = linkedHashSet.iterator();
                if (it.hasNext()) {
                    throw null;
                }
            }
        }
        return zS;
    }
}
