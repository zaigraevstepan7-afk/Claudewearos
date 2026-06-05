package androidx.appcompat.view.menu;

import ac.d;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.anonlab.voidlauncher.R;
import i.a;
import l.h;
import l.i;
import l.o;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements o, AbsListView.SelectionBoundsAdjuster {
    public ImageView A;
    public LinearLayout B;
    public final Drawable C;
    public final int D;
    public final Context E;
    public boolean F;
    public final Drawable G;
    public final boolean H;
    public LayoutInflater I;
    public boolean J;

    /* renamed from: a, reason: collision with root package name */
    public i f770a;

    /* renamed from: b, reason: collision with root package name */
    public ImageView f771b;

    /* renamed from: c, reason: collision with root package name */
    public RadioButton f772c;

    /* renamed from: d, reason: collision with root package name */
    public TextView f773d;

    /* renamed from: e, reason: collision with root package name */
    public CheckBox f774e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f775f;

    /* renamed from: z, reason: collision with root package name */
    public ImageView f776z;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        d dVarF = d.F(getContext(), attributeSet, a.f8060o, R.attr.listMenuViewStyle);
        this.C = dVarF.l(5);
        TypedArray typedArray = (TypedArray) dVarF.f374c;
        this.D = typedArray.getResourceId(1, -1);
        this.F = typedArray.getBoolean(7, false);
        this.E = context;
        this.G = dVarF.l(8);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.H = typedArrayObtainStyledAttributes.hasValue(0);
        dVarF.I();
        typedArrayObtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.I == null) {
            this.I = LayoutInflater.from(getContext());
        }
        return this.I;
    }

    private void setSubMenuArrowVisible(boolean z2) {
        ImageView imageView = this.f776z;
        if (imageView != null) {
            imageView.setVisibility(z2 ? 0 : 8);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.A;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.A.getLayoutParams();
        rect.top = this.A.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    @Override // l.o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(l.i r11) {
        /*
            Method dump skipped, instructions count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.b(l.i):void");
    }

    @Override // l.o
    public i getItemData() {
        return this.f770a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.C);
        TextView textView = (TextView) findViewById(R.id.title);
        this.f773d = textView;
        int i10 = this.D;
        if (i10 != -1) {
            textView.setTextAppearance(this.E, i10);
        }
        this.f775f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.f776z = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.G);
        }
        this.A = (ImageView) findViewById(R.id.group_divider);
        this.B = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i10, int i11) {
        if (this.f771b != null && this.F) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f771b.getLayoutParams();
            int i12 = layoutParams.height;
            if (i12 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i12;
            }
        }
        super.onMeasure(i10, i11);
    }

    public void setCheckable(boolean z2) {
        CompoundButton compoundButton;
        View view;
        if (!z2 && this.f772c == null && this.f774e == null) {
            return;
        }
        if ((this.f770a.f9818x & 4) != 0) {
            if (this.f772c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f772c = radioButton;
                LinearLayout linearLayout = this.B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f772c;
            view = this.f774e;
        } else {
            if (this.f774e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f774e = checkBox;
                LinearLayout linearLayout2 = this.B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f774e;
            view = this.f772c;
        }
        if (z2) {
            compoundButton.setChecked(this.f770a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox2 = this.f774e;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.f772c;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z2) {
        CompoundButton compoundButton;
        if ((this.f770a.f9818x & 4) != 0) {
            if (this.f772c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.f772c = radioButton;
                LinearLayout linearLayout = this.B;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.f772c;
        } else {
            if (this.f774e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.f774e = checkBox;
                LinearLayout linearLayout2 = this.B;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.f774e;
        }
        compoundButton.setChecked(z2);
    }

    public void setForceShowIcon(boolean z2) {
        this.J = z2;
        this.F = z2;
    }

    public void setGroupDividerEnabled(boolean z2) {
        ImageView imageView = this.A;
        if (imageView != null) {
            imageView.setVisibility((this.H || !z2) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        h hVar = this.f770a.f9808n;
        boolean z2 = this.J;
        if (z2 || this.F) {
            ImageView imageView = this.f771b;
            if (imageView == null && drawable == null && !this.F) {
                return;
            }
            if (imageView == null) {
                ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                this.f771b = imageView2;
                LinearLayout linearLayout = this.B;
                if (linearLayout != null) {
                    linearLayout.addView(imageView2, 0);
                } else {
                    addView(imageView2, 0);
                }
            }
            if (drawable == null && !this.F) {
                this.f771b.setVisibility(8);
                return;
            }
            ImageView imageView3 = this.f771b;
            if (!z2) {
                drawable = null;
            }
            imageView3.setImageDrawable(drawable);
            if (this.f771b.getVisibility() != 0) {
                this.f771b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f773d.getVisibility() != 8) {
                this.f773d.setVisibility(8);
            }
        } else {
            this.f773d.setText(charSequence);
            if (this.f773d.getVisibility() != 0) {
                this.f773d.setVisibility(0);
            }
        }
    }
}
