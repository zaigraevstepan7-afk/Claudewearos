package df;

import android.graphics.Paint;
import android.graphics.Path;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: i, reason: collision with root package name */
    public static final int[] f5111i = new int[3];
    public static final float[] j = {0.0f, 0.5f, 1.0f};

    /* renamed from: k, reason: collision with root package name */
    public static final int[] f5112k = new int[4];

    /* renamed from: l, reason: collision with root package name */
    public static final float[] f5113l = {0.0f, 0.0f, 0.5f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    public final Paint f5114a;

    /* renamed from: b, reason: collision with root package name */
    public final Paint f5115b;

    /* renamed from: c, reason: collision with root package name */
    public final Paint f5116c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5117d;

    /* renamed from: e, reason: collision with root package name */
    public final int f5118e;

    /* renamed from: f, reason: collision with root package name */
    public final int f5119f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f5120g = new Path();

    /* renamed from: h, reason: collision with root package name */
    public final Paint f5121h;

    public a() {
        Paint paint = new Paint();
        this.f5121h = paint;
        Paint paint2 = new Paint();
        this.f5114a = paint2;
        this.f5117d = l4.a.d(-16777216, 68);
        this.f5118e = l4.a.d(-16777216, 20);
        this.f5119f = l4.a.d(-16777216, 0);
        paint2.setColor(this.f5117d);
        paint.setColor(0);
        Paint paint3 = new Paint(4);
        this.f5115b = paint3;
        paint3.setStyle(Paint.Style.FILL);
        this.f5116c = new Paint(paint3);
    }
}
