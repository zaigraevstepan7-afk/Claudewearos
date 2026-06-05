package com.google.android.material.datepicker;

import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.anonlab.voidlauncher.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.NavigationMenuItemView;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class j extends t4.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f3860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f3861e;

    public /* synthetic */ j(Object obj, int i10) {
        this.f3860d = i10;
        this.f3861e = obj;
    }

    @Override // t4.b
    public void c(View view, AccessibilityEvent accessibilityEvent) {
        switch (this.f3860d) {
            case 2:
                super.c(view, accessibilityEvent);
                accessibilityEvent.setChecked(((CheckableImageButton) this.f3861e).f3913d);
                break;
            default:
                super.c(view, accessibilityEvent);
                break;
        }
    }

    @Override // t4.b
    public final void d(View view, u4.e eVar) {
        int i10;
        int i11 = this.f3860d;
        Object obj = this.f3861e;
        View.AccessibilityDelegate accessibilityDelegate = this.f15694a;
        switch (i11) {
            case 0:
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, eVar.f16615a);
                m mVar = (m) obj;
                eVar.b(new u4.c(16, mVar.z0.getVisibility() == 0 ? mVar.I().getResources().getString(R.string.mtrl_picker_toggle_to_year_selection) : mVar.I().getResources().getString(R.string.mtrl_picker_toggle_to_day_selection)));
                break;
            case 1:
                AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
                MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) obj;
                int i12 = MaterialButtonToggleGroup.J;
                if (view instanceof MaterialButton) {
                    int i13 = 0;
                    for (int i14 = 0; i14 < materialButtonToggleGroup.getChildCount(); i14++) {
                        if (materialButtonToggleGroup.getChildAt(i14) == view) {
                            i10 = i13;
                        } else {
                            if ((materialButtonToggleGroup.getChildAt(i14) instanceof MaterialButton) && materialButtonToggleGroup.getChildAt(i14).getVisibility() != 8) {
                                i13++;
                            }
                        }
                    }
                    i10 = -1;
                } else {
                    i10 = -1;
                }
                accessibilityNodeInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(0, 1, i10, 1, false, ((MaterialButton) view).H));
                break;
            case 2:
                AccessibilityNodeInfo accessibilityNodeInfo2 = eVar.f16615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo2);
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                accessibilityNodeInfo2.setCheckable(checkableImageButton.f3914e);
                accessibilityNodeInfo2.setChecked(checkableImageButton.f3913d);
                break;
            default:
                AccessibilityNodeInfo accessibilityNodeInfo3 = eVar.f16615a;
                accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo3);
                accessibilityNodeInfo3.setCheckable(((NavigationMenuItemView) obj).Q);
                break;
        }
    }
}
