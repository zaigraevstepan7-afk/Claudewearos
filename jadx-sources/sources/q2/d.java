package q2;

import b3.e;
import com.google.android.gms.internal.ads.zzbch;
import java.util.ArrayList;
import java.util.Stack;
import rg.h;
import ug.f;
import ug.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public int f13188a;

    /* renamed from: b, reason: collision with root package name */
    public int f13189b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f13190c;

    /* renamed from: d, reason: collision with root package name */
    public Object f13191d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f13192e;

    /* renamed from: f, reason: collision with root package name */
    public final Object f13193f;

    /* renamed from: g, reason: collision with root package name */
    public final Object f13194g;

    /* renamed from: h, reason: collision with root package name */
    public final Object f13195h;

    public d(f fVar) {
        this.f13191d = null;
        this.f13192e = new Stack();
        this.f13188a = -1;
        this.f13190c = true;
        this.f13193f = new ArrayList();
        this.f13194g = new ArrayList();
        this.f13195h = fVar;
    }

    public void a(long j, float f10) {
        int i10 = (this.f13189b + 1) % 20;
        this.f13189b = i10;
        a[] aVarArr = (a[]) this.f13192e;
        a aVar = aVarArr[i10];
        if (aVar != null) {
            aVar.f13180a = j;
            aVar.f13181b = f10;
        } else {
            a aVar2 = new a();
            aVar2.f13180a = j;
            aVar2.f13181b = f10;
            aVarArr[i10] = aVar2;
        }
    }

    public float b(float f10) {
        float f11;
        boolean z2;
        int i10;
        float fSignum;
        float f12 = f10;
        float f13 = 0.0f;
        if (f12 <= 0.0f) {
            s2.a.b("maximumVelocity should be a positive value. You specified=" + f12);
        }
        boolean z10 = this.f13190c;
        c cVar = (c) this.f13191d;
        float[] fArr = (float[]) this.f13193f;
        float[] fArr2 = (float[]) this.f13194g;
        int i11 = this.f13189b;
        a[] aVarArr = (a[]) this.f13192e;
        a aVar = aVarArr[i11];
        if (aVar == null) {
            f11 = 0.0f;
        } else {
            int i12 = 0;
            a aVar2 = aVar;
            while (true) {
                a aVar3 = aVarArr[i11];
                if (aVar3 == null) {
                    f11 = f13;
                    z2 = z10;
                    i10 = 1;
                    break;
                }
                long j = aVar.f13180a;
                f11 = f13;
                z2 = z10;
                long j4 = aVar3.f13180a;
                float f14 = j - j4;
                i10 = 1;
                float fAbs = Math.abs(j4 - aVar2.f13180a);
                aVar2 = (cVar == c.f13185a || z2) ? aVar3 : aVar;
                if (f14 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i12] = aVar3.f13181b;
                fArr2[i12] = -f14;
                if (i11 == 0) {
                    i11 = 20;
                }
                i11--;
                i12++;
                if (i12 >= 20) {
                    break;
                }
                f13 = f11;
                z10 = z2;
            }
            if (i12 >= this.f13188a) {
                int iOrdinal = cVar.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = (float[]) this.f13195h;
                        yd.f.Y(fArr2, fArr, i12, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f11;
                    }
                } else {
                    if (iOrdinal != i10) {
                        throw new e();
                    }
                    int i13 = i12 - i10;
                    float f15 = fArr2[i13];
                    int i14 = i13;
                    float fAbs2 = f11;
                    while (i14 > 0) {
                        int i15 = i14 - 1;
                        float f16 = fArr2[i15];
                        if (f15 != f16) {
                            float f17 = (z2 ? -fArr[i15] : fArr[i14] - fArr[i15]) / (f15 - f16);
                            fAbs2 += Math.abs(f17) * (f17 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i14 == i13) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i14--;
                        f15 = f16;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f13 = fSignum * zzbch.zzq.zzf;
            } else {
                f13 = f11;
            }
        }
        if (f13 == f11 || Float.isNaN(f13)) {
            return f11;
        }
        if (f13 <= f11) {
            f12 = -f12;
            if (f13 >= f12) {
                return f13;
            }
        } else if (f13 <= f12) {
            f12 = f13;
        }
        return f12;
    }

    public h c(int i10) {
        zg.c[] cVarArr = new zg.c[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            cVarArr[i11] = (zg.c) ((Stack) this.f13192e).get(i11);
        }
        return new h(cVarArr);
    }

    public void d() {
        l.b("Can't end range without starting a range!", ((StringBuilder) this.f13191d) != null);
        for (int i10 = 0; i10 < this.f13189b; i10++) {
            ((StringBuilder) this.f13191d).append(")");
        }
        ((StringBuilder) this.f13191d).append(")");
        h hVarC = c(this.f13188a);
        ((ArrayList) this.f13194g).add(l.e(((StringBuilder) this.f13191d).toString()));
        ((ArrayList) this.f13193f).add(hVarC);
        this.f13191d = null;
    }

    public void e() {
        if (((StringBuilder) this.f13191d) != null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        this.f13191d = sb2;
        sb2.append("(");
        og.l lVar = new og.l(c(this.f13189b));
        while (lVar.hasNext()) {
            ((StringBuilder) this.f13191d).append(l.f(((zg.c) lVar.next()).f20592a));
            ((StringBuilder) this.f13191d).append(":(");
        }
        this.f13190c = false;
    }

    public d(boolean z2, c cVar) {
        int i10;
        this.f13190c = z2;
        this.f13191d = cVar;
        if (z2 && cVar.equals(c.f13185a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            i10 = 3;
        } else {
            if (iOrdinal != 1) {
                throw new e();
            }
            i10 = 2;
        }
        this.f13188a = i10;
        this.f13192e = new a[20];
        this.f13193f = new float[20];
        this.f13194g = new float[20];
        this.f13195h = new float[3];
    }

    public /* synthetic */ d() {
        this(false, c.f13185a);
    }

    public d(int i10) {
        this(true, c.f13186b);
    }
}
