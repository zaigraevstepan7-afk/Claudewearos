package di;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public String f5131a;

    /* renamed from: b, reason: collision with root package name */
    public String f5132b;

    /* renamed from: c, reason: collision with root package name */
    public String f5133c;

    /* renamed from: d, reason: collision with root package name */
    public String f5134d;

    /* renamed from: e, reason: collision with root package name */
    public long f5135e;

    /* renamed from: f, reason: collision with root package name */
    public byte f5136f;

    public final c a() {
        if (this.f5136f == 1 && this.f5131a != null && this.f5132b != null && this.f5133c != null && this.f5134d != null) {
            return new c(this.f5131a, this.f5132b, this.f5133c, this.f5134d, this.f5135e);
        }
        StringBuilder sb2 = new StringBuilder();
        if (this.f5131a == null) {
            sb2.append(" rolloutId");
        }
        if (this.f5132b == null) {
            sb2.append(" variantId");
        }
        if (this.f5133c == null) {
            sb2.append(" parameterKey");
        }
        if (this.f5134d == null) {
            sb2.append(" parameterValue");
        }
        if ((1 & this.f5136f) == 0) {
            sb2.append(" templateVersion");
        }
        throw new IllegalStateException("Missing required properties:" + ((Object) sb2));
    }
}
