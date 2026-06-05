package m;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class a2 implements m0 {

    /* renamed from: a, reason: collision with root package name */
    public Toolbar f11048a;

    /* renamed from: b, reason: collision with root package name */
    public int f11049b;

    /* renamed from: c, reason: collision with root package name */
    public View f11050c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f11051d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f11052e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f11053f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f11054g;

    /* renamed from: h, reason: collision with root package name */
    public CharSequence f11055h;

    /* renamed from: i, reason: collision with root package name */
    public CharSequence f11056i;
    public CharSequence j;

    /* renamed from: k, reason: collision with root package name */
    public Window.Callback f11057k;

    /* renamed from: l, reason: collision with root package name */
    public int f11058l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f11059m;

    public final void a(int i10) {
        View view;
        Toolbar toolbar = this.f11048a;
        int i11 = this.f11049b ^ i10;
        this.f11049b = i10;
        if (i11 != 0) {
            if ((i11 & 4) != 0) {
                if ((i10 & 4) != 0) {
                    b();
                }
                if ((this.f11049b & 4) != 0) {
                    Drawable drawable = this.f11053f;
                    if (drawable == null) {
                        drawable = this.f11059m;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i11 & 3) != 0) {
                c();
            }
            if ((i11 & 8) != 0) {
                if ((i10 & 8) != 0) {
                    toolbar.setTitle(this.f11055h);
                    toolbar.setSubtitle(this.f11056i);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i11 & 16) == 0 || (view = this.f11050c) == null) {
                return;
            }
            if ((i10 & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }

    public final void b() {
        Toolbar toolbar = this.f11048a;
        if ((this.f11049b & 4) != 0) {
            if (TextUtils.isEmpty(this.j)) {
                toolbar.setNavigationContentDescription(this.f11058l);
            } else {
                toolbar.setNavigationContentDescription(this.j);
            }
        }
    }

    public final void c() {
        Drawable drawable;
        int i10 = this.f11049b;
        if ((i10 & 2) == 0) {
            drawable = null;
        } else if ((i10 & 1) == 0 || (drawable = this.f11052e) == null) {
            drawable = this.f11051d;
        }
        this.f11048a.setLogo(drawable);
    }
}
