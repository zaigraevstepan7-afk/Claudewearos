package t4;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class s0 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.datastore.preferences.protobuf.j f15773a;

    /* renamed from: b, reason: collision with root package name */
    public List f15774b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f15775c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f15776d;

    public s0(androidx.datastore.preferences.protobuf.j jVar) {
        super(jVar.f948a);
        this.f15776d = new HashMap();
        this.f15773a = jVar;
    }

    public final v0 a(WindowInsetsAnimation windowInsetsAnimation) {
        v0 v0Var = (v0) this.f15776d.get(windowInsetsAnimation);
        if (v0Var == null) {
            v0Var = new v0(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                v0Var.f15784a = new t0(windowInsetsAnimation);
            }
            this.f15776d.put(windowInsetsAnimation, v0Var);
        }
        return v0Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f15773a.k(a(windowInsetsAnimation));
        this.f15776d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f15773a.l(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f15775c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f15775c = arrayList2;
            this.f15774b = Collections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimationH = r0.h(list.get(size));
            v0 v0VarA = a(windowInsetsAnimationH);
            v0VarA.f15784a.e(windowInsetsAnimationH.getFraction());
            this.f15775c.add(v0VarA);
        }
        return this.f15773a.m(m1.d(null, windowInsets), this.f15774b).c();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        q5.b bVarN = this.f15773a.n(a(windowInsetsAnimation), new q5.b(bounds));
        bVarN.getClass();
        com.google.android.gms.common.api.k.y();
        return r0.f(((l4.b) bVarN.f13235b).e(), ((l4.b) bVarN.f13236c).e());
    }
}
