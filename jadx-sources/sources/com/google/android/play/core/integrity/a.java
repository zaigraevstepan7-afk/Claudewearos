package com.google.android.play.core.integrity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class a extends ap {

    /* renamed from: a, reason: collision with root package name */
    private String f4002a;

    /* renamed from: b, reason: collision with root package name */
    private y f4003b;

    @Override // com.google.android.play.core.integrity.ap
    public final ap a(y yVar) {
        this.f4003b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final ap b(String str) {
        this.f4002a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.ap
    public final aq c() {
        y yVar;
        String str = this.f4002a;
        if (str != null && (yVar = this.f4003b) != null) {
            return new aq(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4002a == null) {
            sb2.append(" token");
        }
        if (this.f4003b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
