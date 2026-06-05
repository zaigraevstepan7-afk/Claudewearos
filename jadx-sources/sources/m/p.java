package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;
import com.anonlab.voidlauncher.R;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: b, reason: collision with root package name */
    public static final PorterDuff.Mode f11155b = PorterDuff.Mode.SRC_IN;

    /* renamed from: c, reason: collision with root package name */
    public static p f11156c;

    /* renamed from: a, reason: collision with root package name */
    public m1 f11157a;

    public static synchronized PorterDuffColorFilter b(int i10, PorterDuff.Mode mode) {
        return m1.e(i10, mode);
    }

    public static synchronized void c() {
        if (f11156c == null) {
            p pVar = new p();
            f11156c = pVar;
            pVar.f11157a = m1.b();
            m1 m1Var = f11156c.f11157a;
            uf.p pVar2 = new uf.p();
            pVar2.f17052a = new int[]{R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
            pVar2.f17053b = new int[]{R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
            pVar2.f17054c = new int[]{R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
            pVar2.f17055d = new int[]{R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
            pVar2.f17056e = new int[]{R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
            pVar2.f17057f = new int[]{R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};
            synchronized (m1Var) {
                m1Var.f11137e = pVar2;
            }
        }
    }

    public static void d(Drawable drawable, ak.g gVar, int[] iArr) {
        PorterDuff.Mode mode = m1.f11130f;
        int[] state = drawable.getState();
        if (drawable.mutate() != drawable) {
            Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
            return;
        }
        if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
            drawable.setState(new int[0]);
            drawable.setState(state);
        }
        boolean z2 = gVar.f635b;
        if (!z2 && !gVar.f634a) {
            drawable.clearColorFilter();
            return;
        }
        PorterDuffColorFilter porterDuffColorFilterE = null;
        ColorStateList colorStateList = z2 ? (ColorStateList) gVar.f636c : null;
        PorterDuff.Mode mode2 = gVar.f634a ? (PorterDuff.Mode) gVar.f637d : m1.f11130f;
        if (colorStateList != null && mode2 != null) {
            porterDuffColorFilterE = m1.e(colorStateList.getColorForState(iArr, 0), mode2);
        }
        drawable.setColorFilter(porterDuffColorFilterE);
    }

    public final synchronized Drawable a(Context context, int i10) {
        return this.f11157a.c(context, i10);
    }
}
