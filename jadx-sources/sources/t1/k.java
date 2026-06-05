package t1;

import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k implements Iterable, gj.a {

    /* renamed from: e, reason: collision with root package name */
    public static final k f15461e = new k(0, 0, 0, null);

    /* renamed from: a, reason: collision with root package name */
    public final long f15462a;

    /* renamed from: b, reason: collision with root package name */
    public final long f15463b;

    /* renamed from: c, reason: collision with root package name */
    public final long f15464c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f15465d;

    public k(long j, long j4, long j10, long[] jArr) {
        this.f15462a = j;
        this.f15463b = j4;
        this.f15464c = j10;
        this.f15465d = jArr;
    }

    public final k b(k kVar) {
        k kVarE;
        long j;
        long[] jArr;
        k kVar2 = f15461e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar2;
        }
        long j4 = kVar.f15464c;
        long j10 = kVar.f15464c;
        long[] jArr2 = kVar.f15465d;
        long j11 = kVar.f15463b;
        long j12 = kVar.f15462a;
        long j13 = this.f15464c;
        if (j4 == j13 && jArr2 == (jArr = this.f15465d)) {
            return new k(this.f15462a & (~j12), this.f15463b & (~j11), j13, jArr);
        }
        if (jArr2 != null) {
            kVarE = this;
            for (long j14 : jArr2) {
                kVarE = kVarE.e(j14);
            }
        } else {
            kVarE = this;
        }
        long j15 = 0;
        if (j11 != 0) {
            int i10 = 0;
            while (i10 < 64) {
                if (((1 << i10) & j11) != j15) {
                    j = j15;
                    kVarE = kVarE.e(i10 + j10);
                } else {
                    j = j15;
                }
                i10++;
                j15 = j;
            }
        }
        long j16 = j15;
        if (j12 != j16) {
            for (int i11 = 0; i11 < 64; i11++) {
                if (((1 << i11) & j12) != j16) {
                    kVarE = kVarE.e(i11 + j10 + 64);
                }
            }
        }
        return kVarE;
    }

    public final k e(long j) {
        long[] jArr;
        int iD;
        long[] jArr2;
        long j4 = j - this.f15464c;
        long j10 = 0;
        if (fj.l.i(j4, j10) >= 0 && fj.l.i(j4, 64) < 0) {
            long j11 = 1 << ((int) j4);
            long j12 = this.f15463b;
            if ((j12 & j11) != 0) {
                return new k(this.f15462a, j12 & (~j11), this.f15464c, this.f15465d);
            }
        } else if (fj.l.i(j4, 64) >= 0 && fj.l.i(j4, 128) < 0) {
            long j13 = 1 << (((int) j4) - 64);
            long j14 = this.f15462a;
            if ((j14 & j13) != 0) {
                return new k(j14 & (~j13), this.f15463b, this.f15464c, this.f15465d);
            }
        } else if (fj.l.i(j4, j10) < 0 && (jArr = this.f15465d) != null && (iD = r.d(jArr, j)) >= 0) {
            int length = jArr.length;
            int i10 = length - 1;
            if (i10 == 0) {
                jArr2 = null;
            } else {
                long[] jArr3 = new long[i10];
                if (iD > 0) {
                    qi.k.h0(jArr, jArr3, 0, 0, iD);
                }
                if (iD < i10) {
                    qi.k.h0(jArr, jArr3, iD, iD + 1, length);
                }
                jArr2 = jArr3;
            }
            return new k(this.f15462a, this.f15463b, this.f15464c, jArr2);
        }
        return this;
    }

    public final boolean i(long j) {
        long[] jArr;
        long j4 = j - this.f15464c;
        long j10 = 0;
        return (fj.l.i(j4, j10) < 0 || fj.l.i(j4, (long) 64) >= 0) ? (fj.l.i(j4, (long) 64) < 0 || fj.l.i(j4, (long) 128) >= 0) ? fj.l.i(j4, j10) <= 0 && (jArr = this.f15465d) != null && r.d(jArr, j) >= 0 : ((1 << (((int) j4) - 64)) & this.f15462a) != 0 : ((1 << ((int) j4)) & this.f15463b) != 0;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return mk.b.y(new j(this, null));
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(" [");
        ArrayList arrayList = new ArrayList(qi.m.s0(this));
        Iterator it = iterator();
        while (true) {
            mj.g gVar = (mj.g) it;
            if (!gVar.hasNext()) {
                break;
            }
            arrayList.add(String.valueOf(((Number) gVar.next()).longValue()));
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append((CharSequence) "");
        int size = arrayList.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = arrayList.get(i11);
            i10++;
            if (i10 > 1) {
                sb3.append((CharSequence) ", ");
            }
            if (obj != null ? obj instanceof CharSequence : true) {
                sb3.append((CharSequence) obj);
            } else if (obj instanceof Character) {
                sb3.append(((Character) obj).charValue());
            } else {
                sb3.append((CharSequence) obj.toString());
            }
        }
        sb3.append((CharSequence) "");
        sb2.append(sb3.toString());
        sb2.append(']');
        return sb2.toString();
    }

    public final k w(k kVar) {
        k kVarX;
        k kVarX2;
        long[] jArr;
        k kVar2 = f15461e;
        if (kVar == kVar2) {
            return this;
        }
        if (this == kVar2) {
            return kVar;
        }
        long j = kVar.f15464c;
        long j4 = kVar.f15464c;
        long[] jArr2 = kVar.f15465d;
        long j10 = kVar.f15463b;
        long j11 = kVar.f15462a;
        long j12 = this.f15464c;
        long j13 = this.f15463b;
        long j14 = this.f15462a;
        if (j == j12 && jArr2 == (jArr = this.f15465d)) {
            return new k(j14 | j11, j13 | j10, j12, jArr);
        }
        int i10 = 0;
        long[] jArr3 = this.f15465d;
        if (jArr3 != null) {
            if (jArr2 != null) {
                kVarX = this;
                for (long j15 : jArr2) {
                    kVarX = kVarX.x(j15);
                }
            } else {
                kVarX = this;
            }
            if (j10 != 0) {
                for (int i11 = 0; i11 < 64; i11++) {
                    if (((1 << i11) & j10) != 0) {
                        kVarX = kVarX.x(i11 + j4);
                    }
                }
            }
            if (j11 != 0) {
                while (i10 < 64) {
                    if (((1 << i10) & j11) != 0) {
                        kVarX = kVarX.x(i10 + j4 + 64);
                    }
                    i10++;
                }
            }
            return kVarX;
        }
        if (jArr3 != null) {
            kVarX2 = kVar;
            for (long j16 : jArr3) {
                kVarX2 = kVarX2.x(j16);
            }
        } else {
            kVarX2 = kVar;
        }
        long j17 = this.f15464c;
        if (j13 != 0) {
            for (int i12 = 0; i12 < 64; i12++) {
                if (((1 << i12) & j13) != 0) {
                    kVarX2 = kVarX2.x(i12 + j17);
                }
            }
        }
        if (j14 != 0) {
            while (i10 < 64) {
                if (((1 << i10) & j14) != 0) {
                    kVarX2 = kVarX2.x(i10 + j17 + 64);
                }
                i10++;
            }
        }
        return kVarX2;
    }

    /* JADX WARN: Removed duplicated region for block: B:57:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final t1.k x(long r30) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.k.x(long):t1.k");
    }
}
