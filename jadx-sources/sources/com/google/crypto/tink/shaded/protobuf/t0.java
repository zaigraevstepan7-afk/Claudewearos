package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class t0 implements b1 {

    /* renamed from: a, reason: collision with root package name */
    public final a f4239a;

    /* renamed from: b, reason: collision with root package name */
    public final f1 f4240b;

    /* renamed from: c, reason: collision with root package name */
    public final p f4241c;

    public t0(f1 f1Var, p pVar, a aVar) {
        this.f4240b = f1Var;
        pVar.getClass();
        this.f4241c = pVar;
        this.f4239a = aVar;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final void a(Object obj, Object obj2) {
        c1.w(this.f4240b, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final void b(Object obj) {
        this.f4240b.getClass();
        ((w) obj).unknownFields.f4163e = false;
        this.f4241c.getClass();
        m6.a.q(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final boolean c(Object obj) {
        this.f4241c.getClass();
        m6.a.q(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final Object d() {
        a aVar = this.f4239a;
        return aVar instanceof w ? ((w) aVar).q() : aVar.d().c();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final boolean e(w wVar, w wVar2) {
        this.f4240b.getClass();
        return wVar.unknownFields.equals(wVar2.unknownFields);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final int f(w wVar) {
        this.f4240b.getClass();
        return wVar.unknownFields.hashCode();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final int g(w wVar) {
        this.f4240b.getClass();
        e1 e1Var = wVar.unknownFields;
        int i10 = e1Var.f4162d;
        if (i10 != -1) {
            return i10;
        }
        int iA0 = 0;
        for (int i11 = 0; i11 < e1Var.f4159a; i11++) {
            int i12 = e1Var.f4160b[i11] >>> 3;
            iA0 += l.a0(3, (i) e1Var.f4161c[i11]) + l.i0(i12) + l.h0(2) + (l.h0(1) * 2);
        }
        e1Var.f4162d = iA0;
        return iA0;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final void h(Object obj, byte[] bArr, int i10, int i11, d dVar) {
        w wVar = (w) obj;
        if (wVar.unknownFields == e1.f4158f) {
            wVar.unknownFields = e1.c();
        }
        throw t.m1.f(obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final void i(Object obj, l0 l0Var) {
        this.f4241c.getClass();
        m6.a.q(obj);
        throw null;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.b1
    public final void j(Object obj, androidx.datastore.preferences.protobuf.k kVar, o oVar) {
        this.f4240b.getClass();
        f1.a(obj);
        this.f4241c.getClass();
        obj.getClass();
        throw new ClassCastException();
    }
}
