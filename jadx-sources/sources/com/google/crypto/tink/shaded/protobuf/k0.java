package com.google.crypto.tink.shaded.protobuf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class k0 implements p0 {

    /* renamed from: a, reason: collision with root package name */
    public p0[] f4187a;

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public final a1 a(Class cls) {
        for (p0 p0Var : this.f4187a) {
            if (p0Var.b(cls)) {
                return p0Var.a(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.p0
    public final boolean b(Class cls) {
        for (p0 p0Var : this.f4187a) {
            if (p0Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
