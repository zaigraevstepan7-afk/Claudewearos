package ra;

import com.google.android.gms.internal.ads.zzbch;
import java.util.Map;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final /* synthetic */ class p0 implements ej.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14123a;

    public /* synthetic */ p0(int i10) {
        this.f14123a = i10;
    }

    /* JADX WARN: Type inference failed for: r2v10, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // ej.c
    public final Object invoke(Object obj) {
        switch (this.f14123a) {
            case 0:
                ib.v0 v0Var = (ib.v0) obj;
                fj.l.f(v0Var, "<this>");
                return hj.a.m(hj.a.K(hj.a.L(v0Var)));
            case 1:
                return new s1.c((Map) obj);
            case 2:
                return obj;
            case 3:
                na.b bVar = (na.b) obj;
                fj.l.f(bVar, "it");
                return bVar.f11968a;
            case 4:
                v2.h0 h0Var = (v2.h0) obj;
                fj.l.f(h0Var, "$this$drawWithContent");
                h0Var.f();
                return pi.o.f13011a;
            case 5:
                ((Integer) obj).getClass();
                return pi.o.f13011a;
            case 6:
                lj.b bVar2 = (lj.b) obj;
                fj.l.f(bVar2, "it");
                return dl.a.a(bVar2);
            case 7:
                return pi.o.f13011a;
            case 8:
                return new t.l(((Float) obj).floatValue());
            case 9:
                return new t.l(((Integer) obj).intValue());
            case 10:
                return Integer.valueOf((int) ((t.l) obj).f15223a);
            case 11:
                return new t.l(((s3.f) obj).f14742a);
            case 12:
                return new s3.f(((t.l) obj).f15223a);
            case 13:
                s3.g gVar = (s3.g) obj;
                return new t.m(Float.intBitsToFloat((int) (gVar.f14743a >> 32)), Float.intBitsToFloat((int) (4294967295L & gVar.f14743a)));
            case 14:
                t.m mVar = (t.m) obj;
                return new s3.g((Float.floatToRawIntBits(mVar.f15229a) << 32) | (4294967295L & Float.floatToRawIntBits(mVar.f15230b)));
            case 15:
                b2.e eVar = (b2.e) obj;
                return new t.m(Float.intBitsToFloat((int) (eVar.f1514a >> 32)), Float.intBitsToFloat((int) (4294967295L & eVar.f1514a)));
            case 16:
                t.m mVar2 = (t.m) obj;
                return new b2.e((Float.floatToRawIntBits(mVar2.f15229a) << 32) | (4294967295L & Float.floatToRawIntBits(mVar2.f15230b)));
            case 17:
                b2.b bVar3 = (b2.b) obj;
                return new t.m(Float.intBitsToFloat((int) (bVar3.f1500a >> 32)), Float.intBitsToFloat((int) (4294967295L & bVar3.f1500a)));
            case 18:
                t.m mVar3 = (t.m) obj;
                return new b2.b((Float.floatToRawIntBits(mVar3.f15229a) << 32) | (4294967295L & Float.floatToRawIntBits(mVar3.f15230b)));
            case 19:
                long j = ((s3.j) obj).f14745a;
                return new t.m((int) (j >> 32), (int) (j & 4294967295L));
            case 20:
                t.m mVar4 = (t.m) obj;
                return new s3.j((Math.round(mVar4.f15229a) << 32) | (4294967295L & Math.round(mVar4.f15230b)));
            case zzbch.zzt.zzm /* 21 */:
                long j4 = ((s3.l) obj).f14751a;
                return new t.m((int) (j4 >> 32), (int) (j4 & 4294967295L));
            case 22:
                t.m mVar5 = (t.m) obj;
                int iRound = Math.round(mVar5.f15229a);
                if (iRound < 0) {
                    iRound = 0;
                }
                return new s3.l(((Math.round(mVar5.f15230b) >= 0 ? r10 : 0) & 4294967295L) | (iRound << 32));
            case 23:
                b2.c cVar = (b2.c) obj;
                return new t.o(cVar.f1502a, cVar.f1503b, cVar.f1504c, cVar.f1505d);
            case 24:
                t.o oVar = (t.o) obj;
                return new b2.c(oVar.f15239a, oVar.f15240b, oVar.f15241c, oVar.f15242d);
            case 25:
                return Float.valueOf(((t.l) obj).f15223a);
            case 26:
                return pi.o.f13011a;
            case 27:
                return pi.o.f13011a;
            case 28:
                synchronized (t1.m.f15471c) {
                    ?? r2 = t1.m.f15477i;
                    int size = r2.size();
                    while (i < size) {
                        ((ej.c) r2.get(i)).invoke(obj);
                        i++;
                    }
                }
                return pi.o.f13011a;
            default:
                p0 p0Var = t1.m.f15469a;
                return pi.o.f13011a;
        }
    }
}
