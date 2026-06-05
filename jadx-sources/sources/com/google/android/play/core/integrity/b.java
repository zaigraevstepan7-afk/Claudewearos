package com.google.android.play.core.integrity;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
final class b extends bq {

    /* renamed from: a, reason: collision with root package name */
    private String f4055a;

    /* renamed from: b, reason: collision with root package name */
    private y f4056b;

    @Override // com.google.android.play.core.integrity.bq
    public final bq a(y yVar) {
        this.f4056b = yVar;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final bq b(String str) {
        if (str == null) {
            throw new NullPointerException("Null token");
        }
        this.f4055a = str;
        return this;
    }

    @Override // com.google.android.play.core.integrity.bq
    public final br c() {
        y yVar;
        String str = this.f4055a;
        if (str != null && (yVar = this.f4056b) != null) {
            return new br(str, yVar);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f4055a == null) {
            sb2.append(" token");
        }
        if (this.f4056b == null) {
            sb2.append(" integrityDialogWrapper");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb2.toString()));
    }
}
