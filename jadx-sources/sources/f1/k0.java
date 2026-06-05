package f1;

import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6359a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6360b;

    /* renamed from: c, reason: collision with root package name */
    public int f6361c;

    /* renamed from: d, reason: collision with root package name */
    public final ArrayList f6362d;

    /* renamed from: e, reason: collision with root package name */
    public final q.v f6363e;

    /* renamed from: f, reason: collision with root package name */
    public final pi.m f6364f;

    public k0(ArrayList arrayList, int i10) {
        this.f6359a = arrayList;
        this.f6360b = i10;
        if (i10 < 0) {
            o1.a("Invalid start index");
        }
        this.f6362d = new ArrayList();
        q.v vVar = new q.v();
        int size = arrayList.size();
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            i1.e eVar = (i1.e) this.f6359a.get(i12);
            int i13 = eVar.f8109c;
            int i14 = eVar.f8110d;
            vVar.i(i13, new h1.a(i12, i11, i14));
            i11 += i14;
        }
        this.f6363e = vVar;
        this.f6364f = u6.v.Q(new c1.k1(this, 1));
    }

    public final boolean a(int i10, int i11) {
        int i12;
        q.v vVar = this.f6363e;
        h1.a aVar = (h1.a) vVar.b(i10);
        if (aVar == null) {
            return false;
        }
        int i13 = aVar.f7573b;
        int i14 = i11 - aVar.f7574c;
        aVar.f7574c = i11;
        if (i14 == 0) {
            return true;
        }
        Object[] objArr = vVar.f13098c;
        long[] jArr = vVar.f13096a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i15 = 0;
        while (true) {
            long j = jArr[i15];
            if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j) < 128) {
                        h1.a aVar2 = (h1.a) objArr[(i15 << 3) + i17];
                        if (aVar2.f7573b >= i13 && !aVar2.equals(aVar) && (i12 = aVar2.f7573b + i14) >= 0) {
                            aVar2.f7573b = i12;
                        }
                    }
                    j >>= 8;
                }
                if (i16 != 8) {
                    return true;
                }
            }
            if (i15 == length) {
                return true;
            }
            i15++;
        }
    }
}
