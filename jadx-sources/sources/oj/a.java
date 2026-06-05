package oj;

import com.google.android.gms.internal.ads.zzbch;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a implements Comparable {

    /* renamed from: b, reason: collision with root package name */
    public static final f f12531b = new f(1);

    /* renamed from: c, reason: collision with root package name */
    public static final long f12532c = yd.f.u(4611686018427387903L);

    /* renamed from: d, reason: collision with root package name */
    public static final long f12533d = yd.f.u(-4611686018427387903L);

    /* renamed from: a, reason: collision with root package name */
    public final long f12534a;

    public /* synthetic */ a(long j) {
        this.f12534a = j;
    }

    public static final long a(long j, long j4) {
        long j10 = 1000000;
        long j11 = j4 / j10;
        long jC = yd.f.c(j, j11);
        if (-4611686018426L > jC || jC >= 4611686018427L) {
            return yd.f.u(jC);
        }
        long j12 = ((jC * j10) + (j4 - (j11 * j10))) << 1;
        int i10 = b.f12535a;
        return j12;
    }

    public static final void b(StringBuilder sb2, int i10, int i11, int i12, String str) {
        sb2.append(i10);
        if (i11 != 0) {
            sb2.append('.');
            String strP0 = nj.e.P0(i12, String.valueOf(i11));
            int i13 = -1;
            int length = strP0.length() - 1;
            if (length >= 0) {
                while (true) {
                    int i14 = length - 1;
                    if (strP0.charAt(length) != '0') {
                        i13 = length;
                        break;
                    } else if (i14 < 0) {
                        break;
                    } else {
                        length = i14;
                    }
                }
            }
            int i15 = i13 + 1;
            if (i15 < 3) {
                sb2.append((CharSequence) strP0, 0, i15);
            } else {
                sb2.append((CharSequence) strP0, 0, ((i13 + 3) / 3) * 3);
            }
        }
        sb2.append(str);
    }

    public static int e(long j, long j4) {
        long j10 = j ^ j4;
        if (j10 < 0 || (((int) j10) & 1) == 0) {
            return l.i(j, j4);
        }
        int i10 = (((int) j) & 1) - (((int) j4) & 1);
        return j < 0 ? -i10 : i10;
    }

    public static final long f(long j) {
        return ((((int) j) & 1) != 1 || i(j)) ? p(j, c.f12538d) : j >> 1;
    }

    public static final boolean i(long j) {
        return j == f12532c || j == f12533d;
    }

    public static final long o(long j, long j4) {
        int i10 = ((int) j) & 1;
        if (i10 != (((int) j4) & 1)) {
            return i10 == 1 ? a(j >> 1, j4 >> 1) : a(j4 >> 1, j >> 1);
        }
        if (i10 == 0) {
            long j10 = (j >> 1) + (j4 >> 1);
            if (-4611686018426999999L > j10 || j10 >= 4611686018427000000L) {
                return yd.f.u(j10 / 1000000);
            }
            long j11 = j10 << 1;
            int i11 = b.f12535a;
            return j11;
        }
        long jC = yd.f.c(j >> 1, j4 >> 1);
        if (jC == 9223372036854759646L) {
            throw new IllegalArgumentException("Summing infinite durations of different signs yields an undefined result.");
        }
        if (jC == 4611686018427387903L || jC == -4611686018427387903L) {
            return yd.f.u(jC);
        }
        if (-4611686018426L > jC || jC >= 4611686018427L) {
            return yd.f.u(cg.b.q(jC, -4611686018427387903L, 4611686018427387903L));
        }
        long j12 = (jC * 1000000) << 1;
        int i12 = b.f12535a;
        return j12;
    }

    public static final long p(long j, c cVar) {
        l.f(cVar, "unit");
        if (j == f12532c) {
            return Long.MAX_VALUE;
        }
        if (j == f12533d) {
            return Long.MIN_VALUE;
        }
        return a.a.k(j >> 1, (((int) j) & 1) == 0 ? c.f12536b : c.f12538d, cVar);
    }

    public static final long r(long j) {
        long j4 = ((-(j >> 1)) << 1) + (((int) j) & 1);
        int i10 = b.f12535a;
        return j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return e(this.f12534a, ((a) obj).f12534a);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof a) {
            return this.f12534a == ((a) obj).f12534a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f12534a);
    }

    public final String toString() {
        long j;
        int iP;
        int i10;
        long j4;
        int i11;
        int i12;
        long jR = this.f12534a;
        if (jR == 0) {
            return "0s";
        }
        if (jR == f12532c) {
            return "Infinity";
        }
        if (jR == f12533d) {
            return "-Infinity";
        }
        boolean z2 = jR < 0;
        StringBuilder sb2 = new StringBuilder();
        if (z2) {
            sb2.append('-');
        }
        if (jR < 0) {
            jR = r(jR);
        }
        long jP = p(jR, c.A);
        int iP2 = i(jR) ? 0 : (int) (p(jR, c.f12541z) % 24);
        if (i(jR)) {
            j = 0;
            iP = 0;
        } else {
            j = 0;
            iP = (int) (p(jR, c.f12540f) % 60);
        }
        int iP3 = i(jR) ? 0 : (int) (p(jR, c.f12539e) % 60);
        if (i(jR)) {
            i10 = 1;
            i11 = 0;
        } else {
            if ((((int) jR) & 1) == 1) {
                i10 = 1;
                j4 = ((jR >> 1) % zzbch.zzq.zzf) * 1000000;
            } else {
                i10 = 1;
                j4 = (jR >> 1) % 1000000000;
            }
            i11 = (int) j4;
        }
        int i13 = jP != j ? i10 : 0;
        int i14 = iP2 != 0 ? i10 : 0;
        int i15 = iP != 0 ? i10 : 0;
        int i16 = (iP3 == 0 && i11 == 0) ? 0 : i10;
        if (i13 != 0) {
            sb2.append(jP);
            sb2.append('d');
            i12 = i10;
        } else {
            i12 = 0;
        }
        if (i14 != 0 || (i13 != 0 && (i15 != 0 || i16 != 0))) {
            int i17 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(iP2);
            sb2.append('h');
            i12 = i17;
        }
        if (i15 != 0 || (i16 != 0 && (i14 != 0 || i13 != 0))) {
            int i18 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            sb2.append(iP);
            sb2.append('m');
            i12 = i18;
        }
        if (i16 != 0) {
            int i19 = i12 + 1;
            if (i12 > 0) {
                sb2.append(' ');
            }
            if (iP3 != 0 || i13 != 0 || i14 != 0 || i15 != 0) {
                b(sb2, iP3, i11, 9, "s");
            } else if (i11 >= 1000000) {
                b(sb2, i11 / 1000000, i11 % 1000000, 6, "ms");
            } else if (i11 >= 1000) {
                b(sb2, i11 / zzbch.zzq.zzf, i11 % zzbch.zzq.zzf, 3, "us");
            } else {
                sb2.append(i11);
                sb2.append("ns");
            }
            i12 = i19;
        }
        if (z2 && i12 > i10) {
            sb2.insert(i10, '(').append(')');
        }
        return sb2.toString();
    }
}
