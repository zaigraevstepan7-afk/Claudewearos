package ye;

import android.content.Context;
import android.util.TypedValue;
import com.anonlab.voidlauncher.R;
import u2.b;
import uk.c;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: f, reason: collision with root package name */
    public static final int f20302f = (int) Math.round(5.1000000000000005d);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20303a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20304b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20305c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20306d;

    /* renamed from: e, reason: collision with root package name */
    public final float f20307e;

    public a(Context context) {
        TypedValue typedValueN = c.N(context, R.attr.elevationOverlayEnabled);
        boolean z2 = (typedValueN == null || typedValueN.type != 18 || typedValueN.data == 0) ? false : true;
        int i10 = b.i(context, R.attr.elevationOverlayColor, 0);
        int i11 = b.i(context, R.attr.elevationOverlayAccentColor, 0);
        int i12 = b.i(context, R.attr.colorSurface, 0);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f20303a = z2;
        this.f20304b = i10;
        this.f20305c = i11;
        this.f20306d = i12;
        this.f20307e = f10;
    }
}
