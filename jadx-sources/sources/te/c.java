package te;

import com.google.android.material.carousel.CarouselLayoutManager;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class c extends f7.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f16322b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ CarouselLayoutManager f16323c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(CarouselLayoutManager carouselLayoutManager, int i10) {
        super(1);
        this.f16322b = i10;
        switch (i10) {
            case 1:
                this.f16323c = carouselLayoutManager;
                super(0);
                break;
            default:
                this.f16323c = carouselLayoutManager;
                break;
        }
    }

    @Override // f7.c
    public final int b() {
        switch (this.f16322b) {
            case 0:
                return this.f16323c.f15882o;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f16323c;
                return carouselLayoutManager.f15882o - carouselLayoutManager.D();
        }
    }

    @Override // f7.c
    public final int c() {
        switch (this.f16322b) {
            case 0:
                return this.f16323c.E();
            default:
                return 0;
        }
    }

    @Override // f7.c
    public final int d() {
        switch (this.f16322b) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.f16323c;
                return carouselLayoutManager.f15881n - carouselLayoutManager.F();
            default:
                return this.f16323c.f15881n;
        }
    }

    @Override // f7.c
    public final int e() {
        switch (this.f16322b) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.f16323c;
                if (carouselLayoutManager.D0()) {
                    return carouselLayoutManager.f15881n;
                }
                return 0;
        }
    }

    @Override // f7.c
    public final int f() {
        switch (this.f16322b) {
            case 0:
                return 0;
            default:
                return this.f16323c.G();
        }
    }
}
