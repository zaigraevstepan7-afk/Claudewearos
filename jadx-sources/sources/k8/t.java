package k8;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.graphics.ImageDecoder$OnHeaderDecodedListener;
import android.util.Size;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class t implements ImageDecoder$OnHeaderDecodedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ e f9498a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ fj.r f9499b;

    public t(e eVar, fj.r rVar) {
        this.f9498a = eVar;
        this.f9499b = rVar;
    }

    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        Size size = imageInfo.getSize();
        int width = size.getWidth();
        int height = size.getHeight();
        r8.n nVar = this.f9498a.f9466b;
        long jI = a.a.i(width, height, nVar.f13902b, nVar.f13903c, (s8.h) h8.n.e(nVar, r8.h.f13888b));
        int i10 = (int) (jI >> 32);
        int i11 = (int) (jI & 4294967295L);
        if (width > 0 && height > 0 && (width != i10 || height != i11)) {
            double dJ = a.a.j(width, height, i10, i11, this.f9498a.f9466b.f13903c);
            boolean z2 = dJ < 1.0d;
            this.f9499b.f6803a = z2;
            if (z2 || this.f9498a.f9466b.f13904d == s8.d.f14780a) {
                imageDecoder.setTargetSize(hj.a.G(width * dJ), hj.a.G(dJ * height));
            }
        }
        imageDecoder.setOnPartialImageListener(new q());
        r8.n nVar2 = this.f9498a.f9466b;
        imageDecoder.setAllocator(r8.i.a(nVar2) == Bitmap.Config.HARDWARE ? 3 : 1);
        imageDecoder.setMemorySizePolicy(!((Boolean) h8.n.e(nVar2, r8.i.f13897g)).booleanValue() ? 1 : 0);
        gf.f fVar = r8.i.f13893c;
        if (((ColorSpace) h8.n.e(nVar2, fVar)) != null) {
            imageDecoder.setTargetColorSpace((ColorSpace) h8.n.e(nVar2, fVar));
        }
        imageDecoder.setUnpremultipliedRequired(!((Boolean) h8.n.e(nVar2, r8.i.f13894d)).booleanValue());
    }
}
