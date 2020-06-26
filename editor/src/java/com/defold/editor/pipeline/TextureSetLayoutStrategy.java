// Copyright 2020 The Defold Foundation
// Licensed under the Defold License version 1.0 (the "License"); you may not use
// this file except in compliance with the License.
// 
// You may obtain a copy of the License, together with FAQs at
// https://www.defold.com/license
// 
// Unless required by applicable law or agreed to in writing, software distributed
// under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
// CONDITIONS OF ANY KIND, either express or implied. See the License for the
// specific language governing permissions and limitations under the License.

package com.defold.editor.pipeline;

import java.util.List;

import com.defold.editor.pipeline.TextureSetLayout.Layout;
import com.defold.editor.pipeline.TextureSetLayout.Rect;

public interface TextureSetLayoutStrategy {
    List<Layout> createLayout(List<Rect> srcRects);
}