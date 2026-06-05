package ek;

import ak.o;
import ak.u;
import ak.w;
import ak.z;
import dk.k;
import java.util.ArrayList;
import wh.s;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6085a;

    /* renamed from: b, reason: collision with root package name */
    public final k f6086b;

    /* renamed from: c, reason: collision with root package name */
    public final s f6087c;

    /* renamed from: d, reason: collision with root package name */
    public final int f6088d;

    /* renamed from: e, reason: collision with root package name */
    public final w f6089e;

    /* renamed from: f, reason: collision with root package name */
    public final u f6090f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6091g;

    /* renamed from: h, reason: collision with root package name */
    public final int f6092h;

    /* renamed from: i, reason: collision with root package name */
    public final int f6093i;
    public int j;

    public e(ArrayList arrayList, k kVar, s sVar, int i10, w wVar, u uVar, int i11, int i12, int i13) {
        this.f6085a = arrayList;
        this.f6086b = kVar;
        this.f6087c = sVar;
        this.f6088d = i10;
        this.f6089e = wVar;
        this.f6090f = uVar;
        this.f6091g = i11;
        this.f6092h = i12;
        this.f6093i = i13;
    }

    public final z a(w wVar) {
        return b(wVar, this.f6086b, this.f6087c);
    }

    public final z b(w wVar, k kVar, s sVar) {
        ArrayList arrayList = this.f6085a;
        int size = arrayList.size();
        int i10 = this.f6088d;
        if (i10 >= size) {
            throw new AssertionError();
        }
        this.j++;
        s sVar2 = this.f6087c;
        if (sVar2 != null && !((b) sVar2.f19382d).f().j(wVar.f735a)) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i10 - 1) + " must retain the same host and port");
        }
        if (sVar2 != null && this.j > 1) {
            throw new IllegalStateException("network interceptor " + arrayList.get(i10 - 1) + " must call proceed() exactly once");
        }
        int i11 = i10 + 1;
        e eVar = new e(arrayList, kVar, sVar, i11, wVar, this.f6090f, this.f6091g, this.f6092h, this.f6093i);
        o oVar = (o) arrayList.get(i10);
        z zVarA = oVar.a(eVar);
        if (sVar != null && i11 < arrayList.size() && eVar.j != 1) {
            throw new IllegalStateException("network interceptor " + oVar + " must call proceed() exactly once");
        }
        if (zVarA == null) {
            throw new NullPointerException("interceptor " + oVar + " returned null");
        }
        if (zVarA.f763z != null) {
            return zVarA;
        }
        throw new IllegalStateException("interceptor " + oVar + " returned a response with no body");
    }
}
