package o3;

import android.text.TextPaint;
import c2.s;
import c2.u;
import c2.v0;
import g3.n0;
import g3.o;
import g3.q;
import g3.v;
import g3.x;
import java.util.ArrayList;
import r3.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: a, reason: collision with root package name */
    public static final k f12418a = new k(false);

    public static final boolean a(n0 n0Var) {
        v vVar;
        x xVar = n0Var.f7153c;
        g3.i iVar = (xVar == null || (vVar = xVar.f7192b) == null) ? null : new g3.i(vVar.f7189b);
        boolean z2 = false;
        if (iVar != null && iVar.f7112a == 1) {
            z2 = true;
        }
        return !z2;
    }

    public static final void b(o oVar, u uVar, s sVar, float f10, v0 v0Var, l lVar, e2.e eVar) {
        ArrayList arrayList = oVar.f7161h;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            q qVar = (q) arrayList.get(i10);
            qVar.f7166a.p(uVar, sVar, f10, v0Var, lVar, eVar);
            uVar.p(0.0f, qVar.f7166a.j());
        }
    }

    public static final void c(TextPaint textPaint, float f10) {
        if (Float.isNaN(f10)) {
            return;
        }
        if (f10 < 0.0f) {
            f10 = 0.0f;
        }
        if (f10 > 1.0f) {
            f10 = 1.0f;
        }
        textPaint.setAlpha(Math.round(f10 * 255));
    }
}
