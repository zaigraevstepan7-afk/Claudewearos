package r5;

import java.nio.ByteBuffer;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class x {

    /* renamed from: d, reason: collision with root package name */
    public static final ThreadLocal f13769d = new ThreadLocal();

    /* renamed from: a, reason: collision with root package name */
    public final int f13770a;

    /* renamed from: b, reason: collision with root package name */
    public final a8.j f13771b;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f13772c = 0;

    public x(a8.j jVar, int i10) {
        this.f13771b = jVar;
        this.f13770a = i10;
    }

    public final int a(int i10) {
        s5.a aVarB = b();
        int iA = aVarB.a(16);
        if (iA == 0) {
            return 0;
        }
        ByteBuffer byteBuffer = (ByteBuffer) aVarB.f14538d;
        int i11 = iA + aVarB.f14535a;
        return byteBuffer.getInt((i10 * 4) + byteBuffer.getInt(i11) + i11 + 4);
    }

    public final s5.a b() {
        ThreadLocal threadLocal = f13769d;
        s5.a aVar = (s5.a) threadLocal.get();
        if (aVar == null) {
            aVar = new s5.a();
            threadLocal.set(aVar);
        }
        s5.b bVar = (s5.b) this.f13771b.f215a;
        int iA = bVar.a(6);
        if (iA != 0) {
            int i10 = iA + bVar.f14535a;
            int i11 = (this.f13770a * 4) + ((ByteBuffer) bVar.f14538d).getInt(i10) + i10 + 4;
            int i12 = ((ByteBuffer) bVar.f14538d).getInt(i11) + i11;
            ByteBuffer byteBuffer = (ByteBuffer) bVar.f14538d;
            aVar.f14538d = byteBuffer;
            if (byteBuffer != null) {
                aVar.f14535a = i12;
                int i13 = i12 - byteBuffer.getInt(i12);
                aVar.f14536b = i13;
                aVar.f14537c = ((ByteBuffer) aVar.f14538d).getShort(i13);
                return aVar;
            }
            aVar.f14535a = 0;
            aVar.f14536b = 0;
            aVar.f14537c = 0;
        }
        return aVar;
    }

    public final String toString() {
        int i10;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(super.toString());
        sb2.append(", id:");
        s5.a aVarB = b();
        int iA = aVarB.a(4);
        sb2.append(Integer.toHexString(iA != 0 ? ((ByteBuffer) aVarB.f14538d).getInt(iA + aVarB.f14535a) : 0));
        sb2.append(", codepoints:");
        s5.a aVarB2 = b();
        int iA2 = aVarB2.a(16);
        if (iA2 != 0) {
            int i11 = iA2 + aVarB2.f14535a;
            i10 = ((ByteBuffer) aVarB2.f14538d).getInt(((ByteBuffer) aVarB2.f14538d).getInt(i11) + i11);
        } else {
            i10 = 0;
        }
        for (int i12 = 0; i12 < i10; i12++) {
            sb2.append(Integer.toHexString(a(i12)));
            sb2.append(" ");
        }
        return sb2.toString();
    }
}
