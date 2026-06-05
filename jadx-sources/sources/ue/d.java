package ue;

import android.graphics.Rect;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import com.anonlab.voidlauncher.R;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class d extends l5.b {
    public final /* synthetic */ Chip J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(Chip chip, Chip chip2) {
        super(chip2);
        this.J = chip;
    }

    @Override // l5.b
    public final void l(ArrayList arrayList) {
        f fVar;
        arrayList.add(0);
        Rect rect = Chip.P;
        Chip chip = this.J;
        if (!chip.c() || (fVar = chip.f3835e) == null || !fVar.f17022m0 || chip.A == null) {
            return;
        }
        arrayList.add(1);
    }

    @Override // l5.b
    public final void o(int i10, u4.e eVar) {
        AccessibilityNodeInfo accessibilityNodeInfo = eVar.f16615a;
        if (i10 != 1) {
            accessibilityNodeInfo.setContentDescription("");
            accessibilityNodeInfo.setBoundsInParent(Chip.P);
            return;
        }
        Chip chip = this.J;
        CharSequence closeIconContentDescription = chip.getCloseIconContentDescription();
        if (closeIconContentDescription != null) {
            accessibilityNodeInfo.setContentDescription(closeIconContentDescription);
        } else {
            CharSequence text = chip.getText();
            accessibilityNodeInfo.setContentDescription(chip.getContext().getString(R.string.mtrl_chip_close_icon_content_description, TextUtils.isEmpty(text) ? "" : text).trim());
        }
        accessibilityNodeInfo.setBoundsInParent(chip.getCloseIconTouchBoundsInt());
        eVar.b(u4.c.f16600e);
        accessibilityNodeInfo.setEnabled(chip.isEnabled());
        eVar.i(Button.class.getName());
    }

    @Override // l5.b
    public final void p(int i10, boolean z2) {
        Chip chip = this.J;
        if (i10 == 1) {
            chip.F = z2;
        }
        f fVar = chip.f3835e;
        boolean z10 = chip.F;
        boolean zR = false;
        if (fVar.f17023n0 != null) {
            zR = fVar.R(z10 ? new int[]{android.R.attr.state_pressed, android.R.attr.state_enabled} : f.f17002h1);
        }
        if (zR) {
            chip.refreshDrawableState();
        }
    }
}
