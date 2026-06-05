package w1;

import a2.e0;
import android.graphics.Rect;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillManager;
import d3.t;
import q.g0;
import q.w;
import t.m1;
import v2.f0;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class c extends i implements a2.k {
    public final w A;
    public boolean B;

    /* renamed from: a, reason: collision with root package name */
    public final yh.c f18168a;

    /* renamed from: b, reason: collision with root package name */
    public final t f18169b;

    /* renamed from: c, reason: collision with root package name */
    public final w2.t f18170c;

    /* renamed from: d, reason: collision with root package name */
    public final e3.b f18171d;

    /* renamed from: e, reason: collision with root package name */
    public final String f18172e;

    /* renamed from: f, reason: collision with root package name */
    public final Rect f18173f = new Rect();

    /* renamed from: z, reason: collision with root package name */
    public final AutofillId f18174z;

    public c(yh.c cVar, t tVar, w2.t tVar2, e3.b bVar, String str) {
        this.f18168a = cVar;
        this.f18169b = tVar;
        this.f18170c = tVar2;
        this.f18171d = bVar;
        this.f18172e = str;
        tVar2.setImportantForAutofill(1);
        AutofillId autofillId = tVar2.getAutofillId();
        if (autofillId == null) {
            throw m1.e("Required value was null.");
        }
        this.f18174z = autofillId;
        this.A = new w();
    }

    @Override // a2.k
    public final void a(e0 e0Var, e0 e0Var2) {
        f0 f0VarY;
        d3.n nVarW;
        f0 f0VarY2;
        d3.n nVarW2;
        if (e0Var != null && (f0VarY2 = v2.n.y(e0Var)) != null && (nVarW2 = f0VarY2.w()) != null) {
            g0 g0Var = nVarW2.f4758a;
            if (g0Var.b(d3.m.f4739g) || g0Var.b(d3.m.f4740h)) {
                ((AutofillManager) this.f18168a.f20314b).notifyViewExited(this.f18170c, f0VarY2.f17624b);
            }
        }
        if (e0Var2 == null || (f0VarY = v2.n.y(e0Var2)) == null || (nVarW = f0VarY.w()) == null) {
            return;
        }
        g0 g0Var2 = nVarW.f4758a;
        if (g0Var2.b(d3.m.f4739g) || g0Var2.b(d3.m.f4740h)) {
            int i10 = f0VarY.f17624b;
            this.f18171d.f5752b.m(i10, new a(this, i10));
        }
    }
}
