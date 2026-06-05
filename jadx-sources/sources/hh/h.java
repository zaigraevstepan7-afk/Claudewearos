package hh;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class h implements eh.g {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8011a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f8012b = false;

    /* renamed from: c, reason: collision with root package name */
    public eh.c f8013c;

    /* renamed from: d, reason: collision with root package name */
    public final f f8014d;

    public h(f fVar) {
        this.f8014d = fVar;
    }

    @Override // eh.g
    public final eh.g b(String str) {
        if (this.f8011a) {
            throw new eh.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f8011a = true;
        this.f8014d.c(this.f8013c, str, this.f8012b);
        return this;
    }

    @Override // eh.g
    public final eh.g c(boolean z2) {
        if (this.f8011a) {
            throw new eh.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f8011a = true;
        this.f8014d.b(this.f8013c, z2 ? 1 : 0, this.f8012b);
        return this;
    }
}
