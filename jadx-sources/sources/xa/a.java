package xa;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import android.widget.TextView;
import c1.y2;
import com.anonlab.voidlauncher.R;
import com.anonlab.voidlauncher.feature.home.presentation.components.icons.MaskedIconImageView;
import f1.v;
import fj.l;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a {
    public static void a(ImageView imageView, int i10, b bVar, Boolean bool, Float f10, int i11) {
        ViewOutlineProvider bVar2;
        if ((i11 & 8) != 0) {
            bool = null;
        }
        if ((i11 & 16) != 0) {
            f10 = null;
        }
        l.f(bVar, "config");
        lb.b bVar3 = bVar.f19853e;
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        layoutParams.width = i10;
        layoutParams.height = i10;
        imageView.setLayoutParams(layoutParams);
        float f11 = i10 * bVar.f19849a;
        if (f11 < 0.0f) {
            f11 = 0.0f;
        }
        imageView.setBackground(null);
        v vVar = c.f19854a;
        int iOrdinal = bVar3.ordinal();
        boolean z2 = true;
        if (iOrdinal == 0) {
            bVar2 = new ga.b(f11);
        } else if (iOrdinal == 1) {
            bVar2 = new y2(5);
        } else if (iOrdinal == 2) {
            bVar2 = new ue.c();
        } else {
            if (iOrdinal != 3) {
                throw new b3.e();
            }
            bVar2 = new y2(6);
        }
        imageView.setOutlineProvider(bVar2);
        imageView.setClipToOutline(true);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        if (imageView instanceof MaskedIconImageView) {
            MaskedIconImageView maskedIconImageView = (MaskedIconImageView) imageView;
            Context context = maskedIconImageView.getContext();
            l.e(context, "getContext(...)");
            SharedPreferences sharedPreferences = context.getSharedPreferences("home_launcher_settings", 0);
            l.e(sharedPreferences, "getSharedPreferences(...)");
            boolean zBooleanValue = bool != null ? bool.booleanValue() : sharedPreferences.getBoolean("app_icon_highlights", true);
            float fFloatValue = f10 != null ? f10.floatValue() : sharedPreferences.getFloat("icon_highlight_angle", 45.0f);
            if (maskedIconImageView.A == zBooleanValue && maskedIconImageView.B == fFloatValue && maskedIconImageView.C == f11 && maskedIconImageView.D == bVar3) {
                z2 = false;
            }
            maskedIconImageView.A = zBooleanValue;
            maskedIconImageView.B = fFloatValue;
            maskedIconImageView.C = f11;
            maskedIconImageView.D = bVar3;
            if (zBooleanValue) {
                maskedIconImageView.setLayerType(2, null);
            } else {
                maskedIconImageView.setLayerType(0, null);
            }
            if (z2) {
                maskedIconImageView.invalidate();
            }
        }
        imageView.setImageAlpha(255);
    }

    public static void b(TextView textView, String str, b bVar) {
        l.f(str, "text");
        l.f(bVar, "config");
        boolean z2 = bVar.f19852d;
        if (!z2) {
            str = "";
        }
        textView.setText(str);
        textView.setVisibility(z2 ? 0 : 8);
    }

    public static b c(Context context) {
        Resources resources = context.getResources();
        return new b(r1.m() / 100.0f, r1.q() / 100.0f, resources.getDimensionPixelOffset(R.dimen.app_icon_badge_offset), resources.getBoolean(R.bool.app_icon_label_visible), new lb.g(context).n());
    }
}
