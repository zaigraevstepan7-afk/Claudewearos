package e3;

import b0.c1;
import q.v;
import v2.b1;
import v2.f0;
import v2.i0;
import v2.i1;
import v2.n;
import w2.t;
import yd.f;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f5768a;

    /* renamed from: b, reason: collision with root package name */
    public final f0.d f5769b;

    /* renamed from: c, reason: collision with root package name */
    public final c1 f5770c;

    /* renamed from: d, reason: collision with root package name */
    public d f5771d;

    /* renamed from: e, reason: collision with root package name */
    public long f5772e;

    /* renamed from: f, reason: collision with root package name */
    public long f5773f;

    /* renamed from: g, reason: collision with root package name */
    public long f5774g = Long.MIN_VALUE;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ e f5775h;

    public d(e eVar, int i10, f0.d dVar, c1 c1Var) {
        this.f5775h = eVar;
        this.f5768a = i10;
        this.f5769b = dVar;
        this.f5770c = c1Var;
    }

    public final void a(long j, long j4, long j10, long j11, float[] fArr) {
        c cVar;
        c cVar2;
        long j12 = this.f5775h.f5781f;
        f0.d dVar = this.f5769b;
        i1 i1VarV = n.v(dVar, 2);
        f0 f0VarY = n.y(dVar);
        boolean zH = f0VarY.H();
        b1 b1Var = f0VarY.Y;
        if (zH) {
            if (b1Var.f17584d != i1VarV) {
                long jFloatToRawIntBits = (Float.floatToRawIntBits((int) (j & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j >> 32)) << 32);
                long j13 = i1VarV.f15552c;
                i1 i1Var = b1Var.f17584d;
                i1Var.getClass();
                cVar = new c(f.d0(i1Var.C(i1VarV, jFloatToRawIntBits)), (4294967295L & (((int) (r2 & 4294967295L)) + ((int) (j13 & 4294967295L)))) | ((((int) (r2 >> 32)) + ((int) (j13 >> 32))) << 32), j10, j11, j12, fArr, dVar);
            } else {
                cVar = new c(j, j4, j10, j11, j12, fArr, dVar);
            }
            cVar2 = cVar;
        } else {
            cVar2 = null;
        }
        if (cVar2 == null) {
            return;
        }
        this.f5770c.invoke(cVar2);
    }

    public final void b() {
        e eVar = this.f5775h;
        v vVar = eVar.f5776a;
        int i10 = this.f5768a;
        d dVar = (d) vVar.g(i10);
        if (dVar != null) {
            if (dVar.equals(this)) {
                d dVar2 = this.f5771d;
                this.f5771d = null;
                if (dVar2 == null) {
                    f0 f0VarY = n.y(this.f5769b.f17565a);
                    if (f0VarY.f17638z) {
                        ((t) i0.a(f0VarY)).getRectManager().f5752b.k(f0VarY.f17624b, false);
                        return;
                    }
                    return;
                }
                int iD = vVar.d(i10);
                Object[] objArr = vVar.f13098c;
                Object obj = objArr[iD];
                vVar.f13097b[iD] = i10;
                objArr[iD] = dVar2;
                return;
            }
            int iD2 = vVar.d(i10);
            Object[] objArr2 = vVar.f13098c;
            Object obj2 = objArr2[iD2];
            vVar.f13097b[iD2] = i10;
            objArr2[iD2] = dVar;
            while (true) {
                d dVar3 = dVar.f5771d;
                if (dVar3 == null) {
                    break;
                }
                if (dVar3 == this) {
                    dVar.f5771d = this.f5771d;
                    this.f5771d = null;
                    return;
                }
                dVar = dVar3;
            }
        }
        d dVar4 = eVar.f5777b;
        if (dVar4 == this) {
            eVar.f5777b = dVar4.f5771d;
            this.f5771d = null;
            return;
        }
        d dVar5 = dVar4 != null ? dVar4.f5771d : null;
        while (true) {
            d dVar6 = dVar4;
            dVar4 = dVar5;
            if (dVar4 == null) {
                return;
            }
            if (dVar4 == this) {
                if (dVar6 != null) {
                    dVar6.f5771d = dVar4.f5771d;
                }
                this.f5771d = null;
                return;
            }
            dVar5 = dVar4.f5771d;
        }
    }
}
