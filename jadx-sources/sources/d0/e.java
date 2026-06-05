package d0;

import x.o1;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class e implements f0.s {

    /* renamed from: a, reason: collision with root package name */
    public final u f4353a;

    public e(u uVar) {
        this.f4353a = uVar;
    }

    @Override // f0.s
    public final int a() {
        return this.f4353a.g().f4405n;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.List] */
    @Override // f0.s
    public final int b() {
        return Math.min(a() - 1, ((p) qi.l.F0(this.f4353a.g().f4402k)).f4409a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.Object, java.util.Collection, java.util.List] */
    @Override // f0.s
    public final int c() {
        int i10;
        u uVar = this.f4353a;
        int size = 0;
        if (uVar.g().f4402k.isEmpty()) {
            return 0;
        }
        o oVarG = uVar.g();
        int iB = (int) (oVarG.f4406o == o1.f19664a ? oVarG.b() & 4294967295L : oVarG.b() >> 32);
        o oVarG2 = uVar.g();
        ?? r32 = oVarG2.f4402k;
        if (!r32.isEmpty()) {
            int size2 = r32.size();
            int i11 = 0;
            while (size < size2) {
                i11 += ((p) r32.get(size)).f4418k;
                size++;
            }
            size = (i11 / r32.size()) + oVarG2.f4408q;
        }
        if (size != 0 && (i10 = iB / size) >= 1) {
            return i10;
        }
        return 1;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.Collection] */
    @Override // f0.s
    public final boolean d() {
        return !this.f4353a.g().f4402k.isEmpty();
    }

    @Override // f0.s
    public final int e() {
        return Math.max(0, this.f4353a.f4444e.f4425b.g());
    }
}
