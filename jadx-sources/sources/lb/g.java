package lb;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.util.Iterator;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final SharedPreferences f10289a;

    public g(Context context) {
        fj.l.f(context, "context");
        SharedPreferences sharedPreferences = context.getSharedPreferences("home_launcher_settings", 0);
        fj.l.e(sharedPreferences, "getSharedPreferences(...)");
        this.f10289a = sharedPreferences;
    }

    public final void A(float f10) {
        this.f10289a.edit().putFloat("dock_refraction_height", f10).apply();
    }

    public final void B(boolean z2) {
        this.f10289a.edit().putBoolean("dock_velocity_squish", z2).apply();
    }

    public final void C(Uri uri) {
        this.f10289a.edit().putString("wallpaper_uri", uri != null ? uri.toString() : null).apply();
    }

    public final String a() {
        return this.f10289a.getString("asset_wallpaper_name", "1ae847a81dcea4b292f85893a166620e.jpg");
    }

    public final float b() {
        return this.f10289a.getFloat("dock_blur_radius", 6.0f);
    }

    public final float c() {
        return this.f10289a.getFloat("dock_chromatic_aberration", 0.5f);
    }

    public final float d() {
        return this.f10289a.getFloat("dock_corner_radius", 27.0f);
    }

    public final float e() {
        return this.f10289a.getFloat("dock_haze_blur_radius", 18.0f);
    }

    public final float f() {
        return this.f10289a.getFloat("dock_icon_gap", 31.0f);
    }

    public final boolean g() {
        return this.f10289a.getBoolean("dock_liquid_glass", false);
    }

    public final boolean h() {
        return this.f10289a.getBoolean("dock_no_glass_thumb", false);
    }

    public final float i() {
        return this.f10289a.getFloat("dock_refraction_amount", 0.4f);
    }

    public final float j() {
        return this.f10289a.getFloat("dock_refraction_height", 0.55f);
    }

    public final boolean k() {
        return this.f10289a.getBoolean("dock_velocity_squish", true);
    }

    public final boolean l() {
        return this.f10289a.getBoolean("home_overlay_image_enabled", false);
    }

    public final int m() {
        SharedPreferences sharedPreferences = this.f10289a;
        if (sharedPreferences.contains("icon_corner_radius_percent")) {
            return sharedPreferences.getInt("icon_corner_radius_percent", 27);
        }
        if (!sharedPreferences.contains("icon_corner_radius_dp")) {
            return 27;
        }
        int iP = p();
        if (iP < 1) {
            iP = 1;
        }
        return cg.b.p((int) ((sharedPreferences.getInt("icon_corner_radius_dp", 18) / iP) * 100.0f), 0, 50);
    }

    public final b n() {
        a aVar = b.f10141a;
        Object obj = null;
        String string = this.f10289a.getString("icon_shape", null);
        aVar.getClass();
        Iterator it = b.f10147z.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (fj.l.b(((b) next).name(), string)) {
                obj = next;
                break;
            }
        }
        b bVar = (b) obj;
        return bVar == null ? b.f10142b : bVar;
    }

    public final boolean o() {
        return this.f10289a.getBoolean("icon_show_outline", true);
    }

    public final int p() {
        return this.f10289a.getInt("icon_size_dp", 56);
    }

    public final int q() {
        return this.f10289a.getInt("icon_view_size_percent", 90);
    }

    public final int r() {
        return this.f10289a.getInt("wallpaper_customization_version", 0);
    }

    public final Uri s() {
        String string = this.f10289a.getString("wallpaper_uri", null);
        if (string != null) {
            return Uri.parse(string);
        }
        return null;
    }

    public final void t(int i10) {
        this.f10289a.edit().putInt("beyond_viewport_pages", i10).apply();
    }

    public final void u(float f10) {
        this.f10289a.edit().putFloat("dock_blur_radius", f10).apply();
    }

    public final void v(float f10) {
        this.f10289a.edit().putFloat("dock_chromatic_aberration", f10).apply();
    }

    public final void w(float f10) {
        this.f10289a.edit().putFloat("dock_corner_radius", f10).apply();
    }

    public final void x(float f10) {
        this.f10289a.edit().putFloat("dock_haze_blur_radius", f10).apply();
    }

    public final void y(boolean z2) {
        this.f10289a.edit().putBoolean("dock_liquid_glass", z2).apply();
    }

    public final void z(float f10) {
        this.f10289a.edit().putFloat("dock_refraction_amount", f10).apply();
    }
}
