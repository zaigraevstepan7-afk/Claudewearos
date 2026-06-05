package g3;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    public static final long f7185a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f7186b = 0;

    static {
        s3.p[] pVarArr = s3.o.f14756b;
        f7185a = s3.o.f14757c;
    }

    public static final t a(t tVar, int i10, int i11, long j, r3.q qVar, v vVar, r3.i iVar, int i12, int i13, r3.s sVar) {
        long j4;
        int i14 = i10;
        int i15 = i11;
        long j10 = j;
        r3.q qVar2 = qVar;
        v vVar2 = vVar;
        r3.i iVar2 = iVar;
        int i16 = i12;
        int i17 = i13;
        r3.s sVar2 = sVar;
        if (i14 == 0 || i14 == tVar.f7176a) {
            s3.p[] pVarArr = s3.o.f14756b;
            if ((j10 & 1095216660480L) == 0) {
                j4 = 0;
            } else {
                j4 = 0;
                if (s3.o.a(j10, tVar.f7178c)) {
                }
            }
            if ((qVar2 == null || qVar2.equals(tVar.f7179d)) && ((i15 == 0 || i15 == tVar.f7177b) && ((vVar2 == null || vVar2.equals(tVar.f7180e)) && ((iVar2 == null || iVar2.equals(tVar.f7181f)) && ((i16 == 0 || i16 == tVar.f7182g) && ((i17 == 0 || i17 == tVar.f7183h) && (sVar2 == null || sVar2.equals(tVar.f7184i)))))))) {
                return tVar;
            }
        } else {
            j4 = 0;
        }
        s3.p[] pVarArr2 = s3.o.f14756b;
        if ((j10 & 1095216660480L) == j4) {
            j10 = tVar.f7178c;
        }
        if (qVar2 == null) {
            qVar2 = tVar.f7179d;
        }
        if (i14 == 0) {
            i14 = tVar.f7176a;
        }
        if (i15 == 0) {
            i15 = tVar.f7177b;
        }
        v vVar3 = tVar.f7180e;
        if (vVar3 != null && vVar2 == null) {
            vVar2 = vVar3;
        }
        if (iVar2 == null) {
            iVar2 = tVar.f7181f;
        }
        if (i16 == 0) {
            i16 = tVar.f7182g;
        }
        if (i17 == 0) {
            i17 = tVar.f7183h;
        }
        if (sVar2 == null) {
            sVar2 = tVar.f7184i;
        }
        return new t(i14, i15, j10, qVar2, vVar2, iVar2, i16, i17, sVar2);
    }
}
