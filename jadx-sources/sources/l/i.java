package l;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import java.util.ArrayList;
import u6.v;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public final class i implements MenuItem {
    public MenuItem.OnActionExpandListener A;

    /* renamed from: a, reason: collision with root package name */
    public final int f9796a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9797b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9798c;

    /* renamed from: d, reason: collision with root package name */
    public final int f9799d;

    /* renamed from: e, reason: collision with root package name */
    public CharSequence f9800e;

    /* renamed from: f, reason: collision with root package name */
    public CharSequence f9801f;

    /* renamed from: g, reason: collision with root package name */
    public Intent f9802g;

    /* renamed from: h, reason: collision with root package name */
    public char f9803h;
    public char j;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f9806l;

    /* renamed from: n, reason: collision with root package name */
    public final h f9808n;

    /* renamed from: o, reason: collision with root package name */
    public r f9809o;

    /* renamed from: p, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f9810p;

    /* renamed from: q, reason: collision with root package name */
    public CharSequence f9811q;

    /* renamed from: r, reason: collision with root package name */
    public CharSequence f9812r;

    /* renamed from: z, reason: collision with root package name */
    public View f9820z;

    /* renamed from: i, reason: collision with root package name */
    public int f9804i = 4096;

    /* renamed from: k, reason: collision with root package name */
    public int f9805k = 4096;

    /* renamed from: m, reason: collision with root package name */
    public int f9807m = 0;

    /* renamed from: s, reason: collision with root package name */
    public ColorStateList f9813s = null;

    /* renamed from: t, reason: collision with root package name */
    public PorterDuff.Mode f9814t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f9815u = false;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9816v = false;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9817w = false;

    /* renamed from: x, reason: collision with root package name */
    public int f9818x = 16;
    public boolean B = false;

    /* renamed from: y, reason: collision with root package name */
    public int f9819y = 0;

    public i(h hVar, int i10, int i11, int i12, int i13, CharSequence charSequence) {
        this.f9808n = hVar;
        this.f9796a = i11;
        this.f9797b = i10;
        this.f9798c = i12;
        this.f9799d = i13;
        this.f9800e = charSequence;
    }

    public static void a(StringBuilder sb2, int i10, int i11, String str) {
        if ((i10 & i11) == i11) {
            sb2.append(str);
        }
    }

    public final Drawable b(Drawable drawable) {
        if (drawable != null && this.f9817w && (this.f9815u || this.f9816v)) {
            drawable = drawable.mutate();
            if (this.f9815u) {
                drawable.setTintList(this.f9813s);
            }
            if (this.f9816v) {
                drawable.setTintMode(this.f9814t);
            }
            this.f9817w = false;
        }
        return drawable;
    }

    public final i c(CharSequence charSequence) {
        this.f9811q = charSequence;
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean collapseActionView() {
        if ((this.f9819y & 8) == 0) {
            return false;
        }
        if (this.f9820z == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f9808n.d(this);
        }
        return false;
    }

    public final void d(boolean z2) {
        if (z2) {
            this.f9818x |= 32;
        } else {
            this.f9818x &= -33;
        }
    }

    public final i e(CharSequence charSequence) {
        this.f9812r = charSequence;
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final boolean expandActionView() {
        if ((this.f9819y & 8) == 0 || this.f9820z == null) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.A;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f9808n.f(this);
        }
        return false;
    }

    @Override // android.view.MenuItem
    public final ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // android.view.MenuItem
    public final View getActionView() {
        View view = this.f9820z;
        if (view != null) {
            return view;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final int getAlphabeticModifiers() {
        return this.f9805k;
    }

    @Override // android.view.MenuItem
    public final char getAlphabeticShortcut() {
        return this.j;
    }

    @Override // android.view.MenuItem
    public final CharSequence getContentDescription() {
        return this.f9811q;
    }

    @Override // android.view.MenuItem
    public final int getGroupId() {
        return this.f9797b;
    }

    @Override // android.view.MenuItem
    public final Drawable getIcon() {
        Drawable drawable = this.f9806l;
        if (drawable != null) {
            return b(drawable);
        }
        int i10 = this.f9807m;
        if (i10 == 0) {
            return null;
        }
        Drawable drawableG = v.G(this.f9808n.f9776a, i10);
        this.f9807m = 0;
        this.f9806l = drawableG;
        return b(drawableG);
    }

    @Override // android.view.MenuItem
    public final ColorStateList getIconTintList() {
        return this.f9813s;
    }

    @Override // android.view.MenuItem
    public final PorterDuff.Mode getIconTintMode() {
        return this.f9814t;
    }

    @Override // android.view.MenuItem
    public final Intent getIntent() {
        return this.f9802g;
    }

    @Override // android.view.MenuItem
    public final int getItemId() {
        return this.f9796a;
    }

    @Override // android.view.MenuItem
    public final ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // android.view.MenuItem
    public final int getNumericModifiers() {
        return this.f9804i;
    }

    @Override // android.view.MenuItem
    public final char getNumericShortcut() {
        return this.f9803h;
    }

    @Override // android.view.MenuItem
    public final int getOrder() {
        return this.f9798c;
    }

    @Override // android.view.MenuItem
    public final SubMenu getSubMenu() {
        return this.f9809o;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitle() {
        return this.f9800e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f9801f;
        return charSequence != null ? charSequence : this.f9800e;
    }

    @Override // android.view.MenuItem
    public final CharSequence getTooltipText() {
        return this.f9812r;
    }

    @Override // android.view.MenuItem
    public final boolean hasSubMenu() {
        return this.f9809o != null;
    }

    @Override // android.view.MenuItem
    public final boolean isActionViewExpanded() {
        return this.B;
    }

    @Override // android.view.MenuItem
    public final boolean isCheckable() {
        return (this.f9818x & 1) == 1;
    }

    @Override // android.view.MenuItem
    public final boolean isChecked() {
        return (this.f9818x & 2) == 2;
    }

    @Override // android.view.MenuItem
    public final boolean isEnabled() {
        return (this.f9818x & 16) != 0;
    }

    @Override // android.view.MenuItem
    public final boolean isVisible() {
        return (this.f9818x & 8) == 0;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(View view) {
        int i10;
        this.f9820z = view;
        if (view != null && view.getId() == -1 && (i10 = this.f9796a) > 0) {
            view.setId(i10);
        }
        h hVar = this.f9808n;
        hVar.f9785k = true;
        hVar.o(true);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6) {
        if (this.j == c6) {
            return this;
        }
        this.j = Character.toLowerCase(c6);
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setCheckable(boolean z2) {
        int i10 = this.f9818x;
        int i11 = (z2 ? 1 : 0) | (i10 & (-2));
        this.f9818x = i11;
        if (i10 != i11) {
            this.f9808n.o(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setChecked(boolean z2) {
        int i10 = this.f9818x;
        int i11 = i10 & 4;
        h hVar = this.f9808n;
        if (i11 == 0) {
            int i12 = (i10 & (-3)) | (z2 ? 2 : 0);
            this.f9818x = i12;
            if (i10 != i12) {
                hVar.o(false);
            }
            return this;
        }
        ArrayList arrayList = hVar.f9781f;
        int size = arrayList.size();
        hVar.s();
        for (int i13 = 0; i13 < size; i13++) {
            i iVar = (i) arrayList.get(i13);
            if (iVar.f9797b == this.f9797b && (iVar.f9818x & 4) != 0 && iVar.isCheckable()) {
                boolean z10 = iVar == this;
                int i14 = iVar.f9818x;
                int i15 = (z10 ? 2 : 0) | (i14 & (-3));
                iVar.f9818x = i15;
                if (i14 != i15) {
                    iVar.f9808n.o(false);
                }
            }
        }
        hVar.r();
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setContentDescription(CharSequence charSequence) {
        c(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setEnabled(boolean z2) {
        if (z2) {
            this.f9818x |= 16;
        } else {
            this.f9818x &= -17;
        }
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(Drawable drawable) {
        this.f9807m = 0;
        this.f9806l = drawable;
        this.f9817w = true;
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f9813s = colorStateList;
        this.f9815u = true;
        this.f9817w = true;
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f9814t = mode;
        this.f9816v = true;
        this.f9817w = true;
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIntent(Intent intent) {
        this.f9802g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6) {
        if (this.f9803h == c6) {
            return this;
        }
        this.f9803h = c6;
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.A = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f9810p = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10) {
        this.f9803h = c6;
        this.j = Character.toLowerCase(c10);
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final void setShowAsAction(int i10) {
        int i11 = i10 & 3;
        if (i11 != 0 && i11 != 1 && i11 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f9819y = i10;
        h hVar = this.f9808n;
        hVar.f9785k = true;
        hVar.o(true);
    }

    @Override // android.view.MenuItem
    public final MenuItem setShowAsActionFlags(int i10) {
        setShowAsAction(i10);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(CharSequence charSequence) {
        this.f9800e = charSequence;
        this.f9808n.o(false);
        r rVar = this.f9809o;
        if (rVar != null) {
            rVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f9801f = charSequence;
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final /* bridge */ /* synthetic */ MenuItem setTooltipText(CharSequence charSequence) {
        e(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setVisible(boolean z2) {
        int i10 = this.f9818x;
        int i11 = (z2 ? 0 : 8) | (i10 & (-9));
        this.f9818x = i11;
        if (i10 != i11) {
            h hVar = this.f9808n;
            hVar.f9783h = true;
            hVar.o(true);
        }
        return this;
    }

    public final String toString() {
        CharSequence charSequence = this.f9800e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    @Override // android.view.MenuItem
    public final MenuItem setAlphabeticShortcut(char c6, int i10) {
        if (this.j == c6 && this.f9805k == i10) {
            return this;
        }
        this.j = Character.toLowerCase(c6);
        this.f9805k = KeyEvent.normalizeMetaState(i10);
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setNumericShortcut(char c6, int i10) {
        if (this.f9803h == c6 && this.f9804i == i10) {
            return this;
        }
        this.f9803h = c6;
        this.f9804i = KeyEvent.normalizeMetaState(i10);
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setShortcut(char c6, char c10, int i10, int i11) {
        this.f9803h = c6;
        this.f9804i = KeyEvent.normalizeMetaState(i10);
        this.j = Character.toLowerCase(c10);
        this.f9805k = KeyEvent.normalizeMetaState(i11);
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setIcon(int i10) {
        this.f9806l = null;
        this.f9807m = i10;
        this.f9817w = true;
        this.f9808n.o(false);
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setTitle(int i10) {
        setTitle(this.f9808n.f9776a.getString(i10));
        return this;
    }

    @Override // android.view.MenuItem
    public final MenuItem setActionView(int i10) {
        int i11;
        h hVar = this.f9808n;
        Context context = hVar.f9776a;
        View viewInflate = LayoutInflater.from(context).inflate(i10, (ViewGroup) new LinearLayout(context), false);
        this.f9820z = viewInflate;
        if (viewInflate != null && viewInflate.getId() == -1 && (i11 = this.f9796a) > 0) {
            viewInflate.setId(i11);
        }
        hVar.f9785k = true;
        hVar.o(true);
        return this;
    }
}
