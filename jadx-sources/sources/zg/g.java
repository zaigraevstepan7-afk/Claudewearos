package zg;

import java.util.Stack;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class g extends e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ q2.d f20600b;

    public g(q2.d dVar) {
        this.f20600b = dVar;
    }

    @Override // zg.e
    public final void c0(c cVar, r rVar) {
        q2.d dVar = this.f20600b;
        Stack stack = (Stack) dVar.f13192e;
        dVar.e();
        if (dVar.f13190c) {
            ((StringBuilder) dVar.f13191d).append(",");
        }
        ((StringBuilder) dVar.f13191d).append(ug.l.f(cVar.f20592a));
        ((StringBuilder) dVar.f13191d).append(":(");
        if (dVar.f13189b == stack.size()) {
            stack.add(cVar);
        } else {
            stack.set(dVar.f13189b, cVar);
        }
        dVar.f13189b++;
        dVar.f13190c = false;
        q5.b.v(rVar, dVar);
        dVar.f13189b--;
        StringBuilder sb2 = (StringBuilder) dVar.f13191d;
        if (sb2 != null) {
            sb2.append(")");
        }
        dVar.f13190c = true;
    }
}
