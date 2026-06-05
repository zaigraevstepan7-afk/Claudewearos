package w5;

import android.util.Log;
import com.google.android.gms.internal.play_billing.zzco;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a0 implements g.b {

    /* renamed from: a, reason: collision with root package name */
    public final Object f18604a;

    public /* synthetic */ a0(Object obj) {
        this.f18604a = obj;
    }

    @Override // g.b
    public void b(Object obj) {
        Map map = (Map) obj;
        i0 i0Var = (i0) this.f18604a;
        ArrayList arrayList = new ArrayList(map.values());
        int[] iArr = new int[arrayList.size()];
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            iArr[i10] = ((Boolean) arrayList.get(i10)).booleanValue() ? 0 : -1;
        }
        e0 e0Var = (e0) i0Var.F.pollFirst();
        if (e0Var == null) {
            Log.w("FragmentManager", "No permissions were requested for " + this);
        } else {
            String str = e0Var.f18625a;
            if (i0Var.f18643c.v(str) == null) {
                Log.w("FragmentManager", "Permission request result delivered for unknown Fragment " + str);
            }
        }
    }

    public /* synthetic */ a0(w8.h hVar) {
        this.f18604a = (zzco) hVar.f18959a;
    }
}
