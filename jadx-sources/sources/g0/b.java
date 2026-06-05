package g0;

import c2.v0;
import com.google.android.gms.internal.ads.zzbch;
import f1.f1;
import f1.g1;
import g3.o0;
import g3.p0;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class b implements ej.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6851a;

    public /* synthetic */ b(int i10) {
        this.f6851a = i10;
    }

    @Override // ej.e
    public final Object invoke(Object obj, Object obj2) {
        g3.h hVar;
        Object objA;
        s1.a aVar = (s1.a) obj;
        switch (this.f6851a) {
            case 0:
                d dVar = (d) obj2;
                return qi.k.c0(new Object[]{Integer.valueOf(((g1) dVar.f6893d.f3553c).g()), Float.valueOf(cg.b.o(((f1) dVar.f6893d.f3554d).g(), -0.5f, 0.5f)), Integer.valueOf(dVar.l())});
            case 1:
                g3.f fVar = (g3.f) obj2;
                return yd.f.g(fVar.f7081b, g3.d0.a(fVar.f7080a, g3.d0.f7049a, aVar));
            case 2:
                return Integer.valueOf(((r3.l) obj2).f13688a);
            case 3:
                r3.p pVar = (r3.p) obj2;
                return yd.f.g(Float.valueOf(pVar.f13692a), Float.valueOf(pVar.f13693b));
            case 4:
                r3.q qVar = (r3.q) obj2;
                s3.o oVar = new s3.o(qVar.f13695a);
                g3.c0 c0Var = g3.d0.f7069v;
                return yd.f.g(g3.d0.a(oVar, c0Var, aVar), g3.d0.a(new s3.o(qVar.f13696b), c0Var, aVar));
            case 5:
                return Integer.valueOf(((k3.s) obj2).f9401a);
            case 6:
                g3.k kVar = (g3.k) obj2;
                return yd.f.g(kVar.f7126a, g3.d0.a(kVar.f7127b, g3.d0.f7057i, aVar));
            case 7:
                return Float.valueOf(((r3.a) obj2).f13664a);
            case 8:
                List list = (List) obj2;
                ArrayList arrayList = new ArrayList(list.size());
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    arrayList.add(g3.d0.a((g3.d) list.get(i10), g3.d0.f7050b, aVar));
                }
                return arrayList;
            case 9:
                g3.m0 m0Var = (g3.m0) obj2;
                return yd.f.g(Integer.valueOf((int) (m0Var.f7145a >> 32)), Integer.valueOf((int) (m0Var.f7145a & 4294967295L)));
            case 10:
                v0 v0Var = (v0) obj2;
                return yd.f.g(g3.d0.a(new c2.w(v0Var.f3049a), g3.d0.f7063p, aVar), g3.d0.a(new b2.b(v0Var.f3050b), g3.d0.f7071x, aVar), Float.valueOf(v0Var.f3051c));
            case 11:
                return Integer.valueOf(((r3.k) obj2).f13684a);
            case 12:
                return Integer.valueOf(((r3.m) obj2).f13689a);
            case 13:
                return Integer.valueOf(((r3.d) obj2).f13668a);
            case 14:
                return Integer.valueOf(((k3.o) obj2).f9392a);
            case 15:
                return Integer.valueOf(((k3.p) obj2).f9393a);
            case 16:
                s3.o oVar2 = (s3.o) obj2;
                return oVar2 != null ? s3.o.a(oVar2.f14758a, s3.o.f14757c) : false ? Boolean.FALSE : yd.f.g(Float.valueOf(s3.o.c(oVar2.f14758a)), g3.d0.a(new s3.p(s3.o.b(oVar2.f14758a)), g3.d0.f7070w, aVar));
            case 17:
                g3.j jVar = (g3.j) obj2;
                return yd.f.g(jVar.f7115a, g3.d0.a(jVar.f7116b, g3.d0.f7057i, aVar));
            case 18:
                long j = ((s3.p) obj2).f14759a;
                if (s3.p.a(j, 8589934592L)) {
                    return 0;
                }
                if (s3.p.a(j, 4294967296L)) {
                    return 1;
                }
                return Boolean.FALSE;
            case 19:
                b2.b bVar = (b2.b) obj2;
                return bVar != null ? b2.b.c(bVar.f1500a, 9205357640488583168L) : false ? Boolean.FALSE : yd.f.g(Float.valueOf(Float.intBitsToFloat((int) (bVar.f1500a >> 32))), Float.valueOf(Float.intBitsToFloat((int) (bVar.f1500a & 4294967295L))));
            case 20:
                g3.d dVar2 = (g3.d) obj2;
                Object obj3 = dVar2.f7045a;
                if (obj3 instanceof g3.t) {
                    hVar = g3.h.f7104a;
                } else if (obj3 instanceof g3.f0) {
                    hVar = g3.h.f7105b;
                } else if (obj3 instanceof p0) {
                    hVar = g3.h.f7106c;
                } else if (obj3 instanceof o0) {
                    hVar = g3.h.f7107d;
                } else if (obj3 instanceof g3.k) {
                    hVar = g3.h.f7108e;
                } else if (obj3 instanceof g3.j) {
                    hVar = g3.h.f7109f;
                } else {
                    if (!(obj3 instanceof g3.h0)) {
                        throw new UnsupportedOperationException();
                    }
                    hVar = g3.h.f7110z;
                }
                switch (hVar.ordinal()) {
                    case 0:
                        fj.l.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.ParagraphStyle");
                        objA = g3.d0.a((g3.t) obj3, g3.d0.f7055g, aVar);
                        break;
                    case 1:
                        fj.l.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.SpanStyle");
                        objA = g3.d0.a((g3.f0) obj3, g3.d0.f7056h, aVar);
                        break;
                    case 2:
                        fj.l.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.VerbatimTtsAnnotation");
                        objA = g3.d0.a((p0) obj3, g3.d0.f7051c, aVar);
                        break;
                    case 3:
                        fj.l.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.UrlAnnotation");
                        objA = g3.d0.a((o0) obj3, g3.d0.f7052d, aVar);
                        break;
                    case 4:
                        fj.l.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Url");
                        objA = g3.d0.a((g3.k) obj3, g3.d0.f7053e, aVar);
                        break;
                    case 5:
                        fj.l.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.LinkAnnotation.Clickable");
                        objA = g3.d0.a((g3.j) obj3, g3.d0.f7054f, aVar);
                        break;
                    case 6:
                        fj.l.d(obj3, "null cannot be cast to non-null type androidx.compose.ui.text.StringAnnotation");
                        objA = ((g3.h0) obj3).f7111a;
                        break;
                    default:
                        throw new b3.e();
                }
                return yd.f.g(hVar, objA, Integer.valueOf(dVar2.f7046b), Integer.valueOf(dVar2.f7047c), dVar2.f7048d);
            case zzbch.zzt.zzm /* 21 */:
                List list2 = ((n3.b) obj2).f11897a;
                ArrayList arrayList2 = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    arrayList2.add(g3.d0.a((n3.a) list2.get(i11), g3.d0.f7073z, aVar));
                }
                return arrayList2;
            case 22:
                return ((n3.a) obj2).f11895a.toLanguageTag();
            case 23:
                r3.i iVar = (r3.i) obj2;
                return yd.f.g(g3.d0.a(new r3.f(iVar.f13678a), g3.d0.B, aVar), g3.d0.a(new r3.h(iVar.f13679b), g3.d0.C, aVar), g3.d0.a(new r3.g(iVar.f13680c), g3.d0.D, aVar));
            case 24:
                return Float.valueOf(((r3.f) obj2).f13674a);
            case 25:
                return Integer.valueOf(((r3.h) obj2).f13676a);
            case 26:
                return Integer.valueOf(((r3.g) obj2).f13675a);
            case 27:
                return ((p0) obj2).f7165a;
            case 28:
                g3.t tVar = (g3.t) obj2;
                Object objA2 = g3.d0.a(new r3.k(tVar.f7176a), g3.d0.f7064q, aVar);
                Object objA3 = g3.d0.a(new r3.m(tVar.f7177b), g3.d0.f7065r, aVar);
                Object objA4 = g3.d0.a(new s3.o(tVar.f7178c), g3.d0.f7069v, aVar);
                r3.q qVar2 = tVar.f7179d;
                r3.q qVar3 = r3.q.f13694c;
                Object objA5 = g3.d0.a(qVar2, g3.d0.f7059l, aVar);
                Object objA6 = g3.d0.a(tVar.f7180e, g3.e0.f7075a, aVar);
                r3.i iVar2 = tVar.f7181f;
                r3.i iVar3 = r3.i.f13677d;
                return yd.f.g(objA2, objA3, objA4, objA5, objA6, g3.d0.a(iVar2, g3.d0.A, aVar), g3.d0.a(new r3.e(tVar.f7182g), g3.e0.f7077c, aVar), g3.d0.a(new r3.d(tVar.f7183h), g3.d0.f7066s, aVar), g3.d0.a(tVar.f7184i, g3.e0.f7078d, aVar));
            default:
                return ((o0) obj2).f7162a;
        }
    }
}
